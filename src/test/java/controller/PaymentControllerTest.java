package com.example.Payment_Service.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PaymentControllerTest {

    private final MockMvc mockMvc;

    public PaymentControllerTest(MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

    @Test
    public void testDebitPayment() throws Exception {
        mockMvc.perform(post("/api/payment/debit")
                        .param("cardNumber", "1234567890123456")
                        .param("cvv", "123")
                        .param("expirationDate", "12/25")
                        .param("amount", "100.0"))
                .andExpect(status().isOk());
    }
}
