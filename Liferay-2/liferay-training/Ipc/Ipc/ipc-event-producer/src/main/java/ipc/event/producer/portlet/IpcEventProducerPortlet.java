package ipc.event.producer.portlet;

import ipc.event.producer.constants.IpcEventProducerPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.ProcessAction;
import javax.xml.namespace.QName;

import org.osgi.service.component.annotations.Component;

/**
 * @author dt590t
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=IpcEventProducer",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + IpcEventProducerPortletKeys.IPCEVENTPRODUCER,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.supported-publishing-event=message;http://tiwari.com"
	},
	service = Portlet.class
)
public class IpcEventProducerPortlet extends MVCPortlet {
	
	@ProcessAction(name="producer")
	public void sender(ActionRequest request, ActionResponse response) {
		
		String message=ParamUtil.getString(request, "message");
		
		QName qname=new QName("http://tiwari.com","message");
		
		response.setEvent(qname, message);
	}
}