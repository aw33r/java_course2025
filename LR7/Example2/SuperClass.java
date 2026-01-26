package LR7.Example2;

public class SuperClass {

    private String str1;

    SuperClass(String strEx) {
        this.str1 = strEx;
    }

    SuperClass(){
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                "Class name:" + this.getClass().getSimpleName() + "\n" +
                "str 1 = " + this.getStr1();

        return superClassNameAndFieldValue;
    }

    public String getStr1() {
        return str1;
    }

}
