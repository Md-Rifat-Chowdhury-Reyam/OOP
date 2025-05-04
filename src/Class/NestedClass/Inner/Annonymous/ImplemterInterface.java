package Class.NestedClass.Inner.Annonymous;

interface ImplemterInterface {

   void hlw();

}

class annonymous
{
    static ImplemterInterface im = new ImplemterInterface() {
        @Override
        public void hlw() {
            System.out.println(" Hi i m from annonymous class");
        }
    };

    public static void main(String[] args) {
        im.hlw();
    }
}

