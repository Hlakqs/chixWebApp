package za.co.chix_mart.model;
import za.co.chix_mart.model.entities.Quotation;

import java.util.ArrayList;
import java.util.List;

public class ReservationProcessor {




    public List<Quotation> processQuotationData(List<Quotation> quotationDTOs) {
        List<Quotation> quotations = new ArrayList<>();

        for (Quotation dto : quotationDTOs) {
            Quotation quotation = new Quotation();
            quotation.setPrice(dto.getPrice());
            quotation.setProductDescription(dto.getProductDescription());



            quotations.add(quotation);
        }

        return quotations;
    }
}
