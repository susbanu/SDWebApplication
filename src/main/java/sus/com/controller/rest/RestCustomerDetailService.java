package sus.com.controller.rest;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
@RequestMapping(value = "/customer")
@Secured("ROLE_ADMIN")
public class RestCustomerDetailService {

	 @Autowired
	    private ApplicationEventPublisher eventPublisher;
	 
	    /*public CustomerDetailService() {
	        super();
	    }
	 
	    @RequestMapping(value = "/{id}", method = RequestMethod.GET, consumes = { MediaType.APPLICATION_JSON_VALUE })
	    @ResponseBody
	    public CustomerDetails findById(@PathVariable("id") final Long id,
	            final UriComponentsBuilder uriBuilder, final HttpServletResponse response) {
	        return new CustomerDetails(randomAlphabetic(6));
	    }
	 
	    @RequestMapping(method = RequestMethod.GET, consumes = { MediaType.APPLICATION_JSON_VALUE })
	    @ResponseBody
	    public List<CustomerDetails> findAll() {
	        return Lists.newArrayList(new CustomerDetails(randomAlphabetic(6)));
	    }*/
	  
}
