//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args){
        FactoryShape factoryshape = new FactoryShape();
     Shape circle = factoryshape.createShape("circle",1,2,3.4,5,5,5);
     circle.draw();
     Shape rectangle= factoryshape.createShape("rectangle",2,3,4,5,6,7);
     rectangle.area();
    }
}