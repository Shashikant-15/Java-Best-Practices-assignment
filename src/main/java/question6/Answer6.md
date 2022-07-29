
 * In the below code snippet, there is a security concern. Identify it and give reason.	(5)
    // public static void main(String[] args) {

         public static void main() {

        private  boolean authenticate(User user) {

            LOGGER.info("authenticate user {}", user)     // here is a security concern.


            return "User1".equals(user.getUserName) &&  "checkPass".equals(user.getPass));

          }
        }
       }