package tugas.reminder.tugas.reminder.b;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author HP
 */

@Controller
public class projectController {
    
    @RequestMapping("/inputsayuran")
    public String getInput(HttpServletRequest kiriman, Model sayur, String inputharga, 
            String inputjumlah, String inputbayar, String inputkembalian){
        
        String namasayuran = kiriman.getParameter("var_input");
        String Hargaperkilo = kiriman.getParameter("var_harga");
        String Jumlah = kiriman.getParameter("var_jumlah");
        String Total = kiriman.getParameter("var_total");
        String Bayar = kiriman.getParameter("var_bayar");
        
        sayur.addAttribute("sayuran", namasayuran);
        sayur.addAttribute("harga", Hargaperkilo);
        sayur.addAttribute("jumlah", Jumlah);
        sayur.addAttribute("total", Total);
        sayur.addAttribute("bayar", Bayar);
        
        return "View";
    }
    
    
}
