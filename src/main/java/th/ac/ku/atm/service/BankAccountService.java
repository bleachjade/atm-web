package th.ac.ku.atm.service;

import org.springframework.stereotype.Service;
import th.ac.ku.atm.model.BankAccount;
import th.ac.ku.atm.model.Customer;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class BankAccountService {

    private ArrayList<BankAccount> bankAccountArrayList;

    @PostConstruct
    public void postConstruct() {
        bankAccountArrayList = new ArrayList<>();
    }

    public void createBankAccount(BankAccount bankAccount) {
        bankAccountArrayList.add(bankAccount);
    }

    public List<BankAccount> getBankAccounts() {
        return new ArrayList<>(this.bankAccountArrayList);
    }
}
