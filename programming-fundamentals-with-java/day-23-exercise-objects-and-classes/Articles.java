import java.util.Scanner;

class Articles{

    static class Article{

        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }
        public void changeContent(String newContent){
            this.content = newContent;
        }
        public void changeAuthor(String newAuthor){
            this.author = newAuthor;
        }
        public void changeTitle(String newTitle){
            this.title = newTitle;
        }

        @Override
        public String toString() {
            return this.title+" - "+this.content+": "+this.author;
        }
    
    }
    
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        String[] command=scanner.nextLine().split(", ");
        Article article=new Article(command[0], command[1], command[2]);
        int num=Integer.parseInt(scanner.nextLine());
        
        for(int i=0; i<num; i++){
            command=scanner.nextLine().split(": ");
            switch(command[0]){
                case "Edit":
                    article.changeContent(command[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(command[1]);
                    break;
                case "Rename":
                    article.changeTitle(command[1]);
                    break;
            }
        
        }
                
        System.out.println(article.toString());

    }
}
