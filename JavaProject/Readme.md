# Java Swing Practice Project

This repository contains a collection of Java Swing examples created to practice GUI development in Java using **Eclipse IDE**. The project demonstrates the use of various Swing components such as buttons, checkboxes, sliders, dialogs, menus, and more.

## 👨‍💻 Author

**Dnyanesh Bhole**

## 🛠 Technologies Used

- Java (JDK 8 or higher)
- Java Swing (GUI Framework)
- Eclipse IDE (Development Environment)

## 🧾 Project Structure

The project is organized into several packages focusing on:
- **Java fundamentals and OOPs concepts**
- **Core Swing components and layout managers**
- **Interactive Swing practice examples**

### 📂 Packages and Classes

#### `config\fundamentals\sample1`
- `Program1.java`

#### `oops_concept`
- `Inheritance.java`
- `Opps.java`
- `OverLoading.java`
- `Polymorphism.java`

#### `Swing`
- `FlowLayoutEg.java`
- `GridLayoutEg.java`
- `JBorderLayoutEG.java`
- `JButtonEG.java`
- `Jswing1.java`
- `LabelEG.java`
- `LayeredPaneEg.java`
- `Main.java`
- `OpenNewWindowUsingJavaSwing.java`
- `PanelsEg.java`

#### `swnigPractice`
- `CheckBoxexFrame.java`
- `ColorChooserClassFrame.java`
- `ComboBoxFrame.java`
- `DialogBoxesEg.java`
- `Main.java` *(Main runner class)*
- `MenuBarFrame.java`
- `ProgressBarFrame.java`
- `RadioButtonFrame.java`
- `SelectFileFrame.java`
- `SliderFrame.java`
- `TextFieldFrame.java`

#### 📦 Resources
- `background.png`
- `logo.png`

## 🚀 How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/java-swing-practice.git
2. **Open the project in Eclipse IDE.**:
3. **Run the Main.java class from the swnigPractice package.**

   **Inside Main.java, uncomment the class you want to test**:
   ```bash
   // new TextFieldFrame();
   // new CheckBoxexFrame();
   // new RadioButtonFrame();
4.**Build and run the project**
### 📸 Example: CheckBoxexFrame.java
```bash
public class CheckBoxexFrame extends JFrame implements ActionListener {
    JButton button;
    JCheckBox checkbox;

    CheckBoxexFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("submit");
        button.addActionListener(this);

        checkbox = new JCheckBox("I am not robot");
        checkbox.setFont(new Font("Roboto", Font.PLAIN, 25));
        checkbox.setFocusable(false);

        this.add(checkbox);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(checkbox.isSelected());
        }
    }
}


