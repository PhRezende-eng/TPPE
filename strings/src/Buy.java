import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.Test;

public class Buy {
    String id;
    LocalDateTime date;
    User user;
    ArrayList<Product> products;
    // ENUM ("pix, money, credit")
    String paymentType;
    // if(paymentType == "credit") cardId SHOULD BE != NULL
    Card card;
    // double freight;
    // double totalDiscount;
    // double taxICMS;
    // double taxMunicipal;

    public Buy(User user, ArrayList<Product> products, String paymentType, Card card) {
        this.user = user;
        this.products = products;
        this.paymentType = paymentType;
        this.card = card;
        // this.card = user.card;
    };

    @Test
    double calculateTotalDiscount() {
        if (user.userType == "Special") {
            return 1.0;
        } else if (user.userType == "Prime") {
            return 2.0;
        } else if (user.userType == "Standard") {
            return 3.0;
        }
        return 0.0;
    }

    @Test
    double calculateTaxMunicipal() {
        if (user.userType == "Special") {
            return 1.0;
        } else if (user.userType == "Prime") {
            return 2.0;
        } else if (user.userType == "Standard") {
            return 3.0;
        }
        return 0.0;
    }

    @Test
    double calculateTaxICMS() {
        // - Fora do DF 12% de ICMS e 4% de imposto municipal
        // - Dentro do DF 18% de ICMS e 0% de imposto municipal
        if (user.userType == "Special") {
            return 1.0;
        } else if (user.userType == "Prime") {
            return 2.0;
        } else if (user.userType == "Standard") {
            return 3.0;
        }
        return 0.0;
    }

    @Test
    double calculateFreight() {
        // --------------------------- Capital -- Interior
        // ----- Distrito Federal ---- R$ 5,00 -- --------
        // ----- Regiao Centro-oeste - R$ 10,00 - R$ 13,00
        // ----- Regiao Nordeste ----- R$ 15,00 - R$ 18,00
        // ----- Regiao Norte R$ ----- 20,00 ---- R$ 25,00
        // ----- Regiao Sudeste ------ R$ 7,00 -- R$ 10,00
        // ----- Regiao Sul ---------- R$ 10,00 - R$ 13,00
        if (user.userType == "Special") {
            return 1.0;
        } else if (user.userType == "Prime") {
            return 2.0;
        } else if (user.userType == "Standard") {
            return 3.0;
        }
        return 0.0;
    }

}
