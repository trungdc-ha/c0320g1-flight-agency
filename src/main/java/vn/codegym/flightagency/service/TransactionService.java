package vn.codegym.flightagency.service;

import vn.codegym.flightagency.model.Transaction;

import java.util.List;

public interface TransactionService {

    String WAITING = "Chờ thanh toán";
    String CANCELED = "Hủy";
    String PAID = "Đã thanh toán";

    // Created by Toàn
    Transaction findById(Long id);

    // Created by Toàn
    List<Transaction> findUnpaidTransactionByAccount(Long accountId);

    // Created by Toàn
    Transaction findByIdAndPhone(Long id, String phone);

    // Created by Toàn
    Transaction payTransaction(Long id, String taxCode);

    // Created by Toàn
    List<Transaction> payTransactions(List<Long> ids, String taxCode);

    // Created by Toàn
    Transaction cancelTransaction(Long id);

}
