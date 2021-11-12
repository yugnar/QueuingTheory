public class Main {
    public static void main(String[] args) {
        /*
            MMSK
         */
        Mmsk mmsk = new Mmsk(2, 3, 1, 3);
        try {
            System.out.println("ro: " + mmsk.ro());
        } catch (InvalidSystemException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("cn: " + mmsk.cn(3));
        System.out.println("p0: " + mmsk.p0());
        System.out.println("pk: " + mmsk.pn(mmsk.getK()));
        System.out.println("lq: " + mmsk.lq());
        System.out.println("l: " + mmsk.l());
        System.out.println("lambdae: " + mmsk.lambdae());
        System.out.println("wq: " + mmsk.wq());
        System.out.println("w: " + mmsk.w());



        Page pg = new Page();
        pg.run();
    }
}
