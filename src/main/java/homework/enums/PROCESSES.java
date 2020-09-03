package homework.enums;

import lombok.Getter;

@Getter
public enum PROCESSES {
    INFORMATIONAL(100, 199){
        @Override
        void work(){
            System.out.println("Informational");
        }
    },
    SUCCESS(200, 299){
        @Override
        void work() {
            System.out.println("Success");
        }
    },
    REDIRECTION(300, 399){
        @Override
        void work() {
            System.out.println("Redirection");
        }
    },
    CLIENT_ERROR(400, 499){
        @Override
        void work() {
            System.out.println("Client Error");
        }
    },
    SERVER_ERROR(500, 599){
        @Override
        void work() {
            System.out.println("Server Error");
        }
    };
    private int min;
    private int max;

    PROCESSES(int min, int max) {
        this.min = min;
        this.max = max;
    }

    abstract void work();
}
