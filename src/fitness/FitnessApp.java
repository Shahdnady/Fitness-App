package fitness;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FitnessApp {

    public static void main(String[] args) {
        // نافذة البداية (Get Started)
         
        JFrame frame = new JFrame("Fitness Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // عنوان النافذة
        JLabel titleLabel = new JLabel(" Fitness Tracker", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        frame.add(titleLabel, BorderLayout.NORTH);

        // زر "Get Started"
        JButton getStartedButton = new JButton("Get Started");
        getStartedButton.setFont(new Font("Arial", Font.BOLD, 16));
        getStartedButton.addActionListener(e -> openLoginWindow(frame));
        frame.add(getStartedButton, BorderLayout.CENTER);

        // عرض نافذة البداية
        frame.setVisible(true);
    }

    private static void openLoginWindow(JFrame parentFrame) {
        // إغلاق نافذة البداية
        parentFrame.setVisible(false);

    // نافذة تسجيل الدخول
 // نافذة تسجيل الدخول
JFrame loginFrame = new JFrame("Login");
loginFrame.setSize(400, 300);
loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
loginFrame.setLayout(new BoxLayout(loginFrame.getContentPane(), BoxLayout.Y_AXIS));

// إعداد لوحة لتنسيق مكونات البريد الإلكتروني
JPanel emailPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));  // يضمن أن يكون العناصر بجانب بعضها
JLabel emailLabel = new JLabel("Email:");
JTextField emailField = new JTextField(20);
emailPanel.add(emailLabel);
emailPanel.add(emailField);

// إعداد لوحة لتنسيق مكونات كلمة المرور
JPanel passwordPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));  // أيضًا بجانب بعضهما
JLabel passwordLabel = new JLabel("Password:");
JPasswordField passwordField = new JPasswordField(20);
passwordPanel.add(passwordLabel);
passwordPanel.add(passwordField);

// إضافة لوحة البريد الإلكتروني وكلمة المرور إلى الإطار
loginFrame.add(emailPanel);
loginFrame.add(passwordPanel);

// إضافة زر تسجيل الدخول
JButton loginButton = new JButton("Login");
loginButton.addActionListener(e -> {
    String email = emailField.getText();
    String password = new String(passwordField.getPassword());

    // التحقق من أن المستخدم قد أدخل الإيميل وكلمة المرور
    if (email.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(loginFrame, "Please enter both email and password.", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        // إذا كانت البيانات مدخلة بشكل صحيح، نفتح النافذة الرئيسية
        openMainWindow(loginFrame);
    }
});

// إضافة زر التسجيل إذا لم يكن لدى المستخدم حساب
JLabel signUpLabel = new JLabel("Don't have an account?");
signUpLabel.setForeground(Color.RED);  // تعيين اللون الأحمر للنص
JButton signUpButton = new JButton("Sign Up");
signUpButton.addActionListener(e -> openSignUpWindow(loginFrame));

// إضافة جميع المكونات
loginFrame.add(loginButton);
loginFrame.add(signUpLabel);
loginFrame.add(signUpButton);

// عرض نافذة تسجيل الدخول
loginFrame.setVisible(true);


// عرض نافذة تسجيل الدخول
loginFrame.setVisible(true);
    
    }

   private static void openSignUpWindow(JFrame loginFrame) {
    // إغلاق نافذة تسجيل الدخول
    loginFrame.setVisible(false);

    // نافذة التسجيل
    JFrame signUpFrame = new JFrame("Sign Up");
    signUpFrame.setSize(400, 350);
    signUpFrame.setLayout(new FlowLayout());

    JLabel firstNameLabel = new JLabel("First Name:");
    JTextField firstNameField = new JTextField(20);
    JLabel lastNameLabel = new JLabel("Last Name:");
    JTextField lastNameField = new JTextField(20);
    JLabel emailLabel = new JLabel("Email:");
    JTextField emailField = new JTextField(20);
    JLabel passwordLabel = new JLabel("Password:");
    JPasswordField passwordField = new JPasswordField(20);
    JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
    JPasswordField confirmPasswordField = new JPasswordField(20);

    JButton signUpButton = new JButton("Sign Up");
    signUpButton.addActionListener(e -> {
        // هنا يمكن إضافة التحقق من الحقول، مثل التأكد من أن كلمة المرور والتأكيد متطابقين
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());

        if (password.equals(confirmPassword)) {
            // فتح نافذة الدخول بعد التسجيل
            JOptionPane.showMessageDialog(signUpFrame, "Account created successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            loginFrame.setVisible(true);
            signUpFrame.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(signUpFrame, "Passwords do not match.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    });

    signUpFrame.add(firstNameLabel);
    signUpFrame.add(firstNameField);
    signUpFrame.add(lastNameLabel);
    signUpFrame.add(lastNameField);
    signUpFrame.add(emailLabel);
    signUpFrame.add(emailField);
    signUpFrame.add(passwordLabel);
    signUpFrame.add(passwordField);
    signUpFrame.add(confirmPasswordLabel);
    signUpFrame.add(confirmPasswordField);
    signUpFrame.add(signUpButton);

    signUpFrame.setVisible(true);
}


    private static void openMainWindow(JFrame parentFrame) {
        // إغلاق نافذة تسجيل الدخول أو التسجيل
        parentFrame.setVisible(false);

        // نافذة التطبيق الرئيسية
        JFrame mainFrame = new JFrame("Fitness Tracker");
        mainFrame.setSize(600, 400);
        mainFrame.setLayout(new BorderLayout());

        // إضافة شريط التبويب
        JTabbedPane tabs = new JTabbedPane();

        // لوحة Activity Tracker
        JPanel activityPanel = new JPanel(new BorderLayout());
        JLabel activityLabel = new JLabel("Log Your Activities", JLabel.CENTER);
        activityPanel.add(activityLabel, BorderLayout.NORTH);

        JTextArea activityTextArea = new JTextArea();
        activityTextArea.setEditable(false);
        activityPanel.add(new JScrollPane(activityTextArea), BorderLayout.CENTER);

        JPanel activityInputPanel = new JPanel();
        JTextField activityInput = new JTextField(20);
        JButton addActivityButton = new JButton("Add Activity");
        activityInputPanel.add(activityInput);
        activityInputPanel.add(addActivityButton);
        activityPanel.add(activityInputPanel, BorderLayout.SOUTH);

        ActivityTrackerProxy activityProxy = new ActivityTrackerProxy();
        addActivityButton.addActionListener(e -> {
            String activity = activityInput.getText();
            if (!activity.isEmpty()) {
                activityProxy.addActivity(activity);
                activityTextArea.setText(String.join("\n", activityProxy.getActivities()));
                activityInput.setText("");
            }
        });

        tabs.add("Activity Tracker", activityPanel);

        // لوحة Goal Management
        JPanel goalPanel = new JPanel(new BorderLayout());
        JLabel goalLabel = new JLabel("Set Your Goals", JLabel.CENTER);
        goalPanel.add(goalLabel, BorderLayout.NORTH);

        JTextArea goalTextArea = new JTextArea();
        goalTextArea.setEditable(false);
        goalPanel.add(new JScrollPane(goalTextArea), BorderLayout.CENTER);

        JPanel goalInputPanel = new JPanel();
        JTextField goalInput = new JTextField(15);
        JTextField descriptionInput = new JTextField(15);
        JButton addGoalButton = new JButton("Add Goal");
        goalInputPanel.add(new JLabel("Goal:"));
        goalInputPanel.add(goalInput);
        goalInputPanel.add(new JLabel("Description:"));
        goalInputPanel.add(descriptionInput);
        goalInputPanel.add(addGoalButton);
        goalPanel.add(goalInputPanel, BorderLayout.SOUTH);

        GoalManagementSystem goalSystem = GoalManagementSystem.getInstance();
        addGoalButton.addActionListener(e -> {
            String goal = goalInput.getText();
            String description = descriptionInput.getText();
            if (!goal.isEmpty() && !description.isEmpty()) {
                goalSystem.addGoal(goal, description);
                goalTextArea.setText(goalSystem.getGoals().toString());
                goalInput.setText("");
                descriptionInput.setText("");
            }
        });

        tabs.add("Goal Management", goalPanel);

        // لوحة Workout Routine
        JPanel workoutPanel = new JPanel(new BorderLayout());
        JLabel workoutLabel = new JLabel("Build Your Workout Routine", JLabel.CENTER);
        workoutPanel.add(workoutLabel, BorderLayout.NORTH);

        JTextArea workoutTextArea = new JTextArea();
        workoutTextArea.setEditable(false);
        workoutPanel.add(new JScrollPane(workoutTextArea), BorderLayout.CENTER);

        JPanel workoutInputPanel = new JPanel();
        JTextField workoutInput = new JTextField(20);
        JButton addWorkoutButton = new JButton("Add Exercise");
        workoutInputPanel.add(workoutInput);
        workoutInputPanel.add(addWorkoutButton);
        workoutPanel.add(workoutInputPanel, BorderLayout.SOUTH);

        WorkoutRoutine.Builder routineBuilder = new WorkoutRoutine.Builder();
        addWorkoutButton.addActionListener(e -> {
            String exercise = workoutInput.getText();
            if (!exercise.isEmpty()) {
                routineBuilder.addExercise(exercise);
                workoutTextArea.setText("Workout Routine: " + exercise);
                workoutInput.setText("");
            }
        });

        tabs.add("Workout Routine", workoutPanel);

        // لوحة Nutrition Plan
        JPanel nutritionPanel = new JPanel(new BorderLayout());
        JLabel nutritionLabel = new JLabel("Your Nutrition Plan", JLabel.CENTER);
        nutritionPanel.add(nutritionLabel, BorderLayout.NORTH);

        JTextArea nutritionTextArea = new JTextArea();
        nutritionTextArea.setEditable(false);
        nutritionPanel.add(new JScrollPane(nutritionTextArea), BorderLayout.CENTER);

        JPanel nutritionInputPanel = new JPanel();
        JTextField nutritionInput = new JTextField(20);
        JButton addNutritionButton = new JButton("Add Plan");
        nutritionInputPanel.add(nutritionInput);
        nutritionInputPanel.add(addNutritionButton);
        nutritionPanel.add(nutritionInputPanel, BorderLayout.SOUTH);

        addNutritionButton.addActionListener(e -> {
            String plan = nutritionInput.getText();
            if (!plan.isEmpty()) {
                nutritionTextArea.setText("Nutrition Plan: " + plan);
                nutritionInput.setText("");
            }
        });

        tabs.add("Nutrition Plan", nutritionPanel);

        // إضافة التبويبات إلى الإطار
        mainFrame.add(tabs, BorderLayout.CENTER);

        // عرض الإطار
        mainFrame.setVisible(true);
    }

    
}
