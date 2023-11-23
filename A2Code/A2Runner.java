package A2Code;

public class A2Runner {
    
    public static void main(String arg[]){
        Encrypt schemeA = new SchemeA();
        Encrypt schemeB = new SchemeB();
        HomeBase homebase = new HomeBase(schemeA);//homebase with default scheme of scheme A
        homebase.setscheme(schemeB);//change to scheme B now
        homebase.update();
        FieldBase FieldA = new FieldBase("FieldA",homebase);
        FieldBase FieldB = new FieldBase("FieldB",homebase);
        homebase.addfield(FieldA);//add field A to homebase
        Spy spy1 = new Spy("Bob",FieldA);//new spies in field A
        Spy spy2 = new Spy("Spy2",FieldA);
        Spy spy3 = new Spy("Spy3",FieldB);
        System.out.println();

        FieldA.sendMessage(homebase, "try", "B");
        spy1.sendMessage(homebase, "I'm new here", "B");
        homebase.setscheme(schemeA);
        homebase.update();
        homebase.sendMessage(FieldA, "try try", spy3);
        spy2.sendMessage(homebase, "Me too", "A");
        spy3.sendMessage(spy1, "Hey nice to meet u", 2);
        spy1.sendMessage(FieldB,"Your spy3 said hello to me",1);
        homebase.sendMessage(homebase, "test here", 1);
        System.out.println("HOMEHOUSE SAW" + homebase.getAllMessages());
        System.out.println("spy1 Saw" + spy1.getAllMessages());
        System.out.println("FieldA Saw" + FieldA.getAllMessages());

        System.out.println("spies registered in field B:");
        FieldB.viewSpies();
        spy3.isdead();
        System.out.println("FieldB Saw" + FieldB.getAllMessages());
        System.out.println("spies registered in field B:");
        FieldB.viewSpies();

        homebase.viewFields();
        homebase.darkenfield(FieldA);
        homebase.viewFields();
    }
}
