package java_swing.bai80;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculator extends JFrame {

    private JTextField textField; // Màn hình hiển thị của máy tính

    public Calculator() {
        // Thiết lập tiêu đề
        this.setTitle("Calculator");

        // Thiết lập kích thước, đóng chương trình, và căn giữa màn hình
        this.setSize(300, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        // Tạo TextField (màn hình hiển thị)
        textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.RIGHT); // Căn lề phải
        textField.setEditable(false); // Không cho phép người dùng nhập trực tiếp
        textField.setFont(new Font("Arial", Font.BOLD, 24)); // Tăng kích thước chữ
        this.add(textField, BorderLayout.NORTH);

        // Tạo bảng chứa các nút bấm
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5)); // Lưới 4x4

        // Các nhãn nút bấm
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        // Thêm các nút bấm vào bảng
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.BOLD, 18)); // Định dạng nút bấm
            buttonPanel.add(button);

            // Thêm sự kiện xử lý khi nhấn nút
            button.addActionListener(new ButtonClickListener());
        }

        // Thêm bảng nút bấm vào chính giữa (CENTER)
        this.add(buttonPanel, BorderLayout.CENTER);

        // Hiển thị cửa sổ
        this.setVisible(true);
    }

    // Lớp xử lý sự kiện cho các nút bấm
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand(); // Lấy nhãn của nút bấm

            if (command.equals("=")) {
                try {
                    String input = textField.getText().trim();
                    if (!input.isEmpty()) {
                        String result = evaluateExpression(input); // Tính toán biểu thức
                        textField.setText(result); // Hiển thị kết quả
                    }
                } catch (ScriptException ex) {
                    textField.setText("Error"); // Hiển thị lỗi nếu không hợp lệ
                } catch (Exception ex) {
                    textField.setText("Error"); // Catch-all for other exceptions
                }
            } else if (command.equals("C")) {
                // Khi nhấn nút "C" thì xóa màn hình
                textField.setText("");
            } else {
                String currentText = textField.getText();
                if (isOperator(command) && !currentText.isEmpty() && isOperator(currentText.substring(currentText.length() - 1))) {
                    return; // Don't allow adding another operator
                }
                textField.setText(currentText + command);
            }
        }
    }

    // Phương thức kiểm tra ký tự có phải là toán tử không
    private boolean isOperator(String input) {
        return input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/");
    }

    // Phương thức tính toán biểu thức toán học
    private String evaluateExpression(String expression) throws ScriptException {
        // Sử dụng ScriptEngine để tính toán biểu thức
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        Object result = engine.eval(expression); // Tính toán biểu thức
        return result.toString();
    }

    public static void main(String[] args) {
        try {
            // Thay đổi giao diện theo hệ thống
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new Calculator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}