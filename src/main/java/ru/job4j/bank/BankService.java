package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс представляет собой модель простейшей банковской системы
 *
 * @author Sveta Dubrova
 * @version 1.0
 */

public class BankService {

    /**
     * Поле принимает всех пользователей с привязанными к ним счетам,
     * хранение осуществляется в коллекции типа HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход данные о пользователе и добавляет его в систему,
     * если ранее этот пользователь отсутствовал.
     * Данные хранятся в созданном списке ArrayList<>()
     *
     * @param user включает в себя ФИО пользователя и его паспортные данные
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод принимает на вход номер паспорта и данные аккаунта,
     * с помощью метода findByPassport осуществляется поиск пользователя.
     * Новый счет привязывается к аккаунту пользователя.
     *
     * @param passport содержит номер паспорта
     * @param account  содержит банковские реквизиты и информацию о балансе на счете пользователя.
     */

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            if (user.getPassport().contains(passport)) {
                list.add(account);
            }
        }
    }

    /**
     * Метод принимает на вход пасортные данные человека
     * и проверяет, есть ли такой пользователь в системе.
     *
     * @param passport содержит номер паспорта
     * @return возвращает имя пользователя по паспортным данным.
     * Если пользователь не найден, возвращается значение null.
     */

    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(us -> us.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * метод осуществляет поиск пользователя по банковским данным и далее
     * с помощью цикла for-each по указанным реквизитам находит нужный счет пользователя.
     *
     * @param passport  содержит номер паспорта
     * @param requisite содержит информацию по банковских реквизитах пользователя
     * @return возвращает данные аккаунта пользователя
     */

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(us -> us.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод осуществляет перевод денежных средств с одного счета на другой.
     * Метод приинмает на вход номер паспорта и реквизиты счета отправителя и получателя
     * и сумму перевода
     *
     * @param srcPassport   обозначает номер паспорта, со счета которого переводят деньги
     * @param srcRequisite  обозначает банковские данные счета, с которого переводят деньги
     * @param destPassport  номер паспорта, на чей счет поступят деньги
     * @param destRequisite банковские данные счета, на который переводятся деньги
     * @param amount        сумма пеервода
     * @return возвращает true при осуществлении перевода и false, если пользователь не найдет, либо на балансе
     * отправителя недостаточно средств для перевода.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite,
                                 double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            destAccount.setBalance(destAccount.getBalance() + amount);
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }
}

