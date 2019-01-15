package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.*;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testCreateInvoice() {

        // Given
        Product p1 = new Product("Book");
        Product p2 = new Product("Pencil");
        Product p3 = new Product("Notebook");

        Item i1 = new Item(p1, new BigDecimal(49),2, new BigDecimal(98));
        Item i2 = new Item(p2, new BigDecimal(5), 3, new BigDecimal(15));
        Item i3 = new Item(p3, new BigDecimal(9), 1, new BigDecimal(9));

        Invoice invoice = new Invoice("1/01/2019");

        invoice.getItemList().add(i1);
        invoice.getItemList().add(i2);
        invoice.getItemList().add(i3);

        i1.setInvoice(invoice);
        i2.setInvoice(invoice);
        i3.setInvoice(invoice);

        System.out.println(invoice.getItemList().size());

        // When
        invoiceDao.save(invoice);

        int result = invoice.getItemList().stream()
                .map(item -> item.getValue().intValue())
                .mapToInt(v -> v).sum();

        //Then
        Assert.assertEquals(122, result);

    }
}
