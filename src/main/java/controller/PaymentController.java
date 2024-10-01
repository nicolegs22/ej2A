package controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @PostMapping("/debit")
    public String debitPayment(@RequestParam String cardNumber,
                               @RequestParam String cvv,
                               @RequestParam String expirationDate,
                               @RequestParam double amount) {
        // Lógica para debitar el pago
        return "Pago procesado con éxito.";
    }

    @GetMapping("/banner")
    public String getBanner() {
        return "Bienvenido al servicio de pago.";
    }
}
