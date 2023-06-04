public class GLA {
    void GLA1() {
        System.out.println("hello");
    }
    class GLA2 extends GLA{
        GLA obj=new GLA();
        @Override
        void GLA1() {
            super.GLA1();
            System.out.println("Tanmay");
        }
    }
}