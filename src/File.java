public class File implements Node{
    String data;

    File(String data){
        this.data = data;
    }


    @Override
    public String getData() {
        return this.data;
    }
}


