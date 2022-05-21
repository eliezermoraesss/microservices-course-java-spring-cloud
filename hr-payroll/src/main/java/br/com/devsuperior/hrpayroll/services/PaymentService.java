package br.com.devsuperior.hrpayroll.services;

import org.springframework.stereotype.Service;

import br.com.devsuperior.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Eliezer", 3500.00, days);
	}
}
