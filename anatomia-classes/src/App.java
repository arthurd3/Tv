public class App {
    public static void main(String[] args) throws Exception {
        Tv televisao = new Tv();
        televisao.ligarTv();
        System.out.println(televisao.getTv());

        televisao.aumentarVol();
        System.out.println(televisao.getVolume());

        televisao.aumentarVol();
        System.out.println(televisao.getVolume());

        televisao.abaixarVol();
        System.out.println(televisao.getVolume());

        televisao.selecionarCanal();
        System.out.println(televisao.getCanal());

        televisao.ligarTv();
        System.out.println(televisao.getTv());

        televisao.desligarTv();
        System.out.println(televisao.getTv());
    }


}
