package interfacestudy;

public  class Son implements Father,Mother {

    public static void main(String[] args) {

        Son son =new Son();
        son.hardwork();
        son.honesty();
        son.nature();
        son.look();
        son.Love();
       Father.kindness();
      Mother.kindness();

    }
        @Override
        public void hardwork () {
            System.out.println("Father hardwork completed in son class");
        }

        @Override
        public void honesty () {
            System.out.println("Father honesty completed in son class");
        }

    @Override
    public void Love()
    {
        Father.super.Love();
        Mother.super.Love();

    }


    @Override
        public void nature () {
            System.out.println("Mother nature completed in son class");
        }

        @Override
        public void look () {
            System.out.println("Mother Look completed in son class");
        }

   // @Override
    //public void Love() {

    //}


}
