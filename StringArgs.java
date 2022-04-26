class StringArgs{
    public static void main(String[] args) {
        if (args.length > 1){
            System.out.println("Bonjour "+ args[0] +" "+ args[1] +"!");
        }

        else{
            System.out.println("Bonjour étranger!");
        }
    }
}