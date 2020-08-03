import com.elisharedservices.mims.core.FastTrack;
import com.elisharedservices.mims.core.xml.XmlObject;
import com.elisharedservices.mims.core.xml.XmlType;
import com.elisharedservices.mims.model.*;
import com.elisharedservices.mims.service.InteractionService;
import com.elisharedservices.mims.service.InteractionServiceImp;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by marlon on 4/17/17.
 */
@Ignore
public class SampleTest {


    InteractionService service = new InteractionServiceImp();

    FastTrack ft = new FastTrack();

    @Test
    public void sampleTest() throws IllegalAccessException {

        Prescribing prescribing = new Prescribing();

        Product product = new Product();

        product.setReference("{83CF7D50-30B9-4D61-9C60-D1CF9FEBA7A9}");

        RouteOfAdministration routeOfAdministration = new RouteOfAdministration();

        routeOfAdministration.setName("Oral");

        product.setRouteOfAdministration(routeOfAdministration);

        List<Product> productList = new ArrayList<>();

        productList.add(product);

        prescribing.setPrescribingProductList(productList);

        Prescribed prescribed = new Prescribed();

        Product product2 = new Product();

        product2.setReference("{4AE6AF0F-2890-4FBB-8F0D-ABFE307C1A71}");

        RouteOfAdministration routeOfAdministration2 = new RouteOfAdministration();

        routeOfAdministration2.setReference("{90075601-10D4-49DD-9292-9B884D9D3EF3}");

        product2.setRouteOfAdministration(routeOfAdministration2);

        List<Product> productList2 = new ArrayList<>();

        productList2.add(product2);

        prescribed.setPrescribedProductList(productList2);

        String xml = service.getRequest(prescribing,prescribed);
//

        System.out.println("request: " + xml);

        String result = ft.getResult(xml);

        System.out.println("result: " + result);


//        XmlObject xmlObjectRequest = new XmlObject();
//
//        xmlObjectRequest.setTagName("Request");
//
//        XmlObject xmlObjectInteraction = new XmlObject();
//
//        xmlObjectInteraction.setTagName("Interaction");
//
//        XmlObject xmlObjectPrescribing = new XmlObject();
//
//        XmlObject xmlObjectPrescribingProduct = new XmlObject();
//
//        xmlObjectPrescribingProduct.setTagName("Product");
//        xmlObjectPrescribingProduct.addAttribute("reference", "{83CF7D50-30B9-4D61-9C60-D1CF9FEBA7A9}");
//
//        XmlObject xmlObjectPrescribingProductRoute = new XmlObject();
//
//        xmlObjectPrescribingProductRoute.setTagName("RouteOfAdministration");
//        xmlObjectPrescribingProductRoute.addAttribute("name", "Oral");
//        xmlObjectPrescribingProductRoute.setXmlType(XmlType.SINGLE);
//
//        xmlObjectPrescribingProduct.addValue(xmlObjectPrescribingProductRoute);
//
//        xmlObjectPrescribing.setTagName("Prescribing");
//
//        xmlObjectPrescribing.addValue(xmlObjectPrescribingProduct);
//
//        XmlObject xmlObjectPrescribed = new XmlObject();
//
//        XmlObject xmlObjectPrescribedProduct = new XmlObject();
//
//        xmlObjectPrescribedProduct.setTagName("Product");
//        xmlObjectPrescribedProduct.addAttribute("reference", "{4AE6AF0F-2890-4FBB-8F0D-ABFE307C1A71}");
//
//        XmlObject xmlObjectPrescribedProductRoute = new XmlObject();
//
//        xmlObjectPrescribedProductRoute.setTagName("RouteOfAdministration");
//        xmlObjectPrescribedProductRoute.addAttribute("reference", "{90075601-10D4-49DD-9292-9B884D9D3EF3}");
//        xmlObjectPrescribedProductRoute.setXmlType(XmlType.SINGLE);
//
//        xmlObjectPrescribedProduct.addValue(xmlObjectPrescribedProductRoute);
//
//        xmlObjectPrescribed.setTagName("Prescribed");
//
//        xmlObjectPrescribed.addValue(xmlObjectPrescribedProduct);
//
//        xmlObjectRequest.addValue(xmlObjectInteraction);
//
//        xmlObjectInteraction.addValue(xmlObjectPrescribing);
//        xmlObjectInteraction.addValue(xmlObjectPrescribed);
//
//        System.out.println(xmlObjectRequest.toString());

    }


}
