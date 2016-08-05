import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class createCustomerList implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		eventContext.getMessage().setInvocationProperty("myProperty", "Hello World!");
        return eventContext.getMessage().getPayload();
	}

}
