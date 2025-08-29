class User {
    private String name;
    private String email;
    private String Phone;
    private String address;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.Phone = builder.Phone;
        this.address = builder.address;
    }

    public void showInfo() {
        System.out.println("Name " + name);
        System.out.println("Email " + email);
        System.out.println("Phone " + Phone);
        System.out.println("Address " + address);
    }

    public static class UserBuilder {
        private String name;
        private String email;
        private String Phone;
        private String address;

        public UserBuilder(String name, String email) {
            this.name = name;
            this.email = email;
        }


        public UserBuilder setphone(String Phone) {
            this.Phone = Phone;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public User build() { // creates the final User object
            return new User(this);
        }
    }
}
    public class Builders {
        public static void main(String[] args) {
            User user = new User.UserBuilder("renuka", "renuka.nandikolla@gmail.com")
                    .setphone("0768955970")
                    .setAddress("karlskrona,sweden")
                    .build();

            user.showInfo();
        }
    }


//A Creational Design Pattern used to construct complex objects step by step.
//Separates object construction from its representation, so you can create different types of objects using the same process.
//When objects have many optional fields or components.
//When a simple constructor would become too complex or messy.
//Makes the code readable, maintainable, and flexible.