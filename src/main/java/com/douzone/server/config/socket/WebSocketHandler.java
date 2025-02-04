package com.douzone.server.config.socket;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Slf4j
@RequiredArgsConstructor
@Component
public class WebSocketHandler extends TextWebSocketHandler {
	private final ObjectMapper objectMapper;
	private final CalendarService calendarService;
	private final TimeService timeService;

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		String payload = message.getPayload();
		log.info("{}", payload);
		TimeMessageReqDTO timeMessageReqDTO = objectMapper.readValue(payload, TimeMessageReqDTO.class);
		CalendarRoomDTO calendarRoomDTO = calendarService.findRoomById(timeMessageReqDTO.getUid());
		calendarRoomDTO.handlerActions(session, timeMessageReqDTO, calendarService, timeService);
	}


}
