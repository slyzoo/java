// this imports the gui
import javax.swing.JOptionPane;

public class main6 {
    public static void main(String[] args) {
//        makes the gui and asks "enter your name"
        String name = JOptionPane.showInputDialog("enter your name");

//        says hello name after you input your name
        JOptionPane.showMessageDialog(null,"hello "+name);


//        integers are weird, so you need to parse it as a string before you ask it
        int age = Integer.parseInt( JOptionPane.showInputDialog("enter your age"));
        JOptionPane.showMessageDialog(null,"you are "+age+" years old");

//        now its doing height
        double height = Double.parseDouble( JOptionPane.showInputDialog("enter your height in feet"));
        JOptionPane.showMessageDialog(null,"you are "+height+" feet tall");

}
}
