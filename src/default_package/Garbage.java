package default_package;

class Garbage {
    public int no;

    public Garbage(int no) {
        this.no = no;
        System.out.printf("Garbage(%d) 생성 \n", no);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.printf("Garbage(%d) 수거 \n", no);
    }
}
