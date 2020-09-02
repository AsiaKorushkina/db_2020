package homework.enums;

public enum PROCESSES {
    INFORMATIONAL(){
        @Override
        void work(){
            System.out.println("Informational");
        }
    },
    SUCCESS(){
        @Override
        void work() {
            System.out.println("Success");
        }
    },
    REDIRECTION(){
        @Override
        void work() {
            System.out.println("Redirection");
        }
    },
    CLIENT_ERROR(){
        @Override
        void work() {
            System.out.println("Client Error");
        }
    },
    SERVER_ERROR(){
        @Override
        void work() {
            System.out.println("Server Error");
        }
    };

    abstract void work();
}
