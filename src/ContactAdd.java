import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContactAdd {

    Integer countContact = 1;


    public static void contactAdd() throws IOException, DataFormatException {
        Contact contact = new Contact();
        Scanner scanner = new Scanner(System.in);

        // ввод фамилии
        while (true) {
            System.out.println("Введите фамилию: ");
            String surname = scanner.nextLine();
            contact.setSurname(surname);
            try {
                if (surname.length() == 1) {
                    throw new FieldException("Фамилия слишко короткая");

                }
                if (surname.isEmpty()) {
                    throw new FieldException("Фамилия не может быть пустым");
                }

            } catch (FieldException exception) {
                System.out.println("Фамилия не может быть пустым");
                continue;
            }
        break;
        }

        // ввод имени
        while (true) {
            System.out.println("Введите имя: ");
            String name = scanner.nextLine();
            contact.setName(name);
            try {
                if (name.isEmpty() || name.length() == 1) {
                    throw new FieldException("Имя слишком короткое");
                }
            } catch (FieldException e) {
                System.out.println("Имя не может быть пустым");
                continue;
            }
        break;
        }

        // ввод отчества
        while (true) {
            System.out.println("Введите отчество: ");
            String patronymic = scanner.nextLine();
            contact.setPatronymic(patronymic);
            try {
                if (patronymic.isEmpty() || patronymic.length() == 1) {
                    throw new FieldException("Отчиство слишком короткое");
                }
            } catch (FieldException e) {
                System.out.println("Отчиство не может быть пустым");
                continue;
            }
            break;
        }

        // ввод даты рождения
        while (true) {
            System.out.println("Введите дату рождения (дд.мм.гггг): ");
            String birthdate = scanner.nextLine();
            contact.setBirthdate(birthdate);
            try {
                if (birthdate.isEmpty() || birthdate.length() == 1) {
                    throw new FieldException("Дата слишком короткая");
                }
            } catch (FieldException e) {
                System.out.println("Дата не может быть пустым");
                continue;
            }
            break;
        }

        // ввод номера телефона
        while (true) {
            System.out.println("Введите номер телефона (ххх): ");
            Scanner scannerNum = new Scanner(System.in);
            try {
                Integer phoneNumber = scannerNum.nextInt();
                if (phoneNumber == null || phoneNumber.toString().length() != 3) {
                    System.out.println("Номер должен содержать 3 цифры");
                    continue;
                }
                contact.setPhoneNumber(phoneNumber);
            } catch (InputMismatchException e) {
                System.out.println("Номер телефона должен содержать только цифры");
                continue;
            }
        break;
        }

        // ввод пола
        while (true) {
            System.out.println("Введите пол (f/m): ");
            Scanner scanGender = new Scanner(System.in);
            String gender = scanGender.nextLine();
                if (gender.equals("f") || gender.equals("m")) {
                    contact.setGender(gender);
                    break;
                }
                else if (gender.equals("")) {
                    System.out.println("Пол не может быть пустым");
                }
                else if (!gender.equals("f") || !gender.equals("m")) {
                    System.out.println("Пол должен содержать 'f' или 'm'. Вы ввели " + gender);
                }

        }


        // запись в фаил
        System.out.println("Контакт добавлен");
        System.out.println(contact);
        ContactSave.save(contact.getSurname(), contact);


    }
}




