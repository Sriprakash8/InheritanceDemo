public class Main {
    public static void main(String[] args) {
//        var control = new UIControl(true);
//        var textBox = new TextBox();
//        show(control);
//    }
//    public static void show(UIControl control){
//        if(control instanceof TextBox){
//            var textBox = (TextBox)control;
//            textBox.setText("Hello");
//        }
//        System.out.println(control);

//        var point1 = new Point(1,2);
//        var point2 = new Point(1,2);
//        System.out.println(point1.hashCode());
//        System.out.println(point2.hashCode());
        UIControl[] controls = { new TextBox(), new checkBox()};
        for(var control : controls)
            control.render();
    }
}
