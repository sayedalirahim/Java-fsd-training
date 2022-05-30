package ipc.event.consumer.portlet;

import ipc.event.consumer.constants.IpcEventConsumerPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Event;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.Portlet;
import javax.portlet.ProcessEvent;

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
		"javax.portlet.display-name=IpcEventConsumer",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + IpcEventConsumerPortletKeys.IPCEVENTCONSUMER,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.supported-processing-event=message;http://tiwari.com"
	},
	service = Portlet.class
)
public class IpcEventConsumerPortlet extends MVCPortlet {
	@ProcessEvent(qname="{http://tiwari.com}message")
	public void consumeEvent(EventRequest request, EventResponse response) {
		Event event=request.getEvent();
		String message=(String) event.getValue();
		request.setAttribute("message", message);
	}
}