package bsuir.diplom.clientapplicationfx.utilities;

import bsuir.diplom.clientapplicationfx.constants.ResponseMessageProto;
import bsuir.diplom.clientapplicationfx.constants.ResponseMessageProto.ResponseMessage;

import java.util.HashMap;

public class ProtoMessageUtil {
    public static ResponseMessage createAuthRequest(String username, String password) {
        ResponseMessageProto.AuthRequest.Builder authRequestBuilder = ResponseMessageProto.AuthRequest.newBuilder();
        authRequestBuilder.setUsername(username);
        authRequestBuilder.setPassword(password);

        ResponseMessage.Builder messageBuilder = ResponseMessage.newBuilder();
        messageBuilder.setCommandType(ResponseMessageProto.CommandType.AUTH);
        messageBuilder.setAuthRequest(authRequestBuilder);
        return messageBuilder.build();
    }

    public static ResponseMessage createAuthResponse(boolean result, int code, String msg, String token, String sessionId, String uid) {
        ResponseMessageProto.AuthResponse.Builder authResponseBuilder = ResponseMessageProto.AuthResponse.newBuilder();
        authResponseBuilder.setResult(result);
        authResponseBuilder.setCode(code);
        authResponseBuilder.setMsg(msg);
        authResponseBuilder.setToken(token);
        authResponseBuilder.setSessionId(sessionId);
        authResponseBuilder.setUid(uid);

        ResponseMessage.Builder messageBuilder = ResponseMessage.newBuilder();
        messageBuilder.setCommandType(ResponseMessageProto.CommandType.AUTH_BACK);
        messageBuilder.setAuthResponse(authResponseBuilder);

        return messageBuilder.build();
    }

    public static ResponseMessage createLogoutRequest(String uid, String token, String sessionId) {
        ResponseMessageProto.LogoutRequest.Builder logoutRequestBuilder = ResponseMessageProto.LogoutRequest.newBuilder();
        logoutRequestBuilder.setUid(uid);
        logoutRequestBuilder.setToken(token);
        logoutRequestBuilder.setSessionId(sessionId);

        ResponseMessage.Builder messageBuilder = ResponseMessage.newBuilder();
        messageBuilder.setCommandType(ResponseMessageProto.CommandType.LOGOUT);
        messageBuilder.setLogoutRequest(logoutRequestBuilder);
        return messageBuilder.build();
    }

    public static ResponseMessage createLogoutResponse(boolean result, int code, String msg) {
        ResponseMessageProto.LogoutResponse.Builder logoutResponseBuilder = ResponseMessageProto.LogoutResponse.newBuilder();
        logoutResponseBuilder.setResult(result);
        logoutResponseBuilder.setCode(code);
        logoutResponseBuilder.setMsg(msg);

        ResponseMessage.Builder messageBuilder = ResponseMessage.newBuilder();
        messageBuilder.setCommandType(ResponseMessageProto.CommandType.LOGOUT_BACK);
        messageBuilder.setLogoutResponse(logoutResponseBuilder);

        return messageBuilder.build();
    }

    public static ResponseMessage createPing(String uid, String token, String sessionId){
        ResponseMessageProto.Ping.Builder pingBuilder = ResponseMessageProto.Ping.newBuilder();
        pingBuilder.setUid(uid);
        pingBuilder.setToken(token);
        pingBuilder.setSessionId(sessionId);

        ResponseMessage.Builder messageBuilder = ResponseMessage.newBuilder();
        messageBuilder.setCommandType(ResponseMessageProto.CommandType.PING);
        messageBuilder.setPing(pingBuilder);
        return messageBuilder.build();
    }

    public static ResponseMessage createPong(boolean result, int code, String msg){
        ResponseMessageProto.Pong.Builder pongBuilder = ResponseMessageProto.Pong.newBuilder();
        pongBuilder.setResult(result);
        pongBuilder.setCode(code);
        pongBuilder.setMsg(msg);

        ResponseMessage.Builder messageBuilder = ResponseMessage.newBuilder();
        messageBuilder.setCommandType(ResponseMessageProto.CommandType.PONG);
        messageBuilder.setPong(pongBuilder);
        return messageBuilder.build();
    }

    public static ResponseMessage createMessageRequest(String uid, String token, String sessionId, String toUid, String toGroup, String msg, int timeStamp){
        ResponseMessageProto.MessageRequest.Builder messageRequestBuilder = ResponseMessageProto.MessageRequest.newBuilder();
        messageRequestBuilder.setUid(uid);
        messageRequestBuilder.setToken(token);
        messageRequestBuilder.setSessionId(sessionId);
        messageRequestBuilder.setToUid(toUid);
        messageRequestBuilder.setToGroup(toGroup);
        messageRequestBuilder.setMessage(msg);
        messageRequestBuilder.setTimeStamp(timeStamp);

        ResponseMessage.Builder messageBuilder = ResponseMessage.newBuilder();
        messageBuilder.setCommandType(ResponseMessageProto.CommandType.SEND_MESSAGE);
        messageBuilder.setMessageRequest(messageRequestBuilder);
        return messageBuilder.build();
    }

    public static ResponseMessage createMessageResponse(boolean result, int code, String msg){
        ResponseMessageProto.MessageResponse.Builder messageResponseBuilder = ResponseMessageProto.MessageResponse.newBuilder();
        messageResponseBuilder.setResult(result);
        messageResponseBuilder.setCode(code);
        messageResponseBuilder.setMsg(msg);

        ResponseMessage.Builder messageBuilder = ResponseMessage.newBuilder();
        messageBuilder.setCommandType(ResponseMessageProto.CommandType.SEND_MESSAGE_BACK);
        messageBuilder.setMessageResponse(messageResponseBuilder);
        return messageBuilder.build();
    }

    public static ResponseMessage createDownloadRequest(String uid, String token, String sessionId, String criteria, int timeStamp){
        ResponseMessageProto.DownloadDataRequest.Builder downloadDataRequestBuilder = ResponseMessageProto.DownloadDataRequest.newBuilder();
        downloadDataRequestBuilder.setUid(uid);
        downloadDataRequestBuilder.setToken(token);
        downloadDataRequestBuilder.setSessionId(sessionId);
        downloadDataRequestBuilder.setCriteria(criteria);
        downloadDataRequestBuilder.setTimeStamp(timeStamp);

        ResponseMessage.Builder messageBuilder = ResponseMessage.newBuilder();
        messageBuilder.setCommandType(ResponseMessageProto.CommandType.DOWNLOAD_DATA);
        messageBuilder.setDownloadDataRequest(downloadDataRequestBuilder);
        return messageBuilder.build();
    }

    public static ResponseMessage createDownloadResponse(boolean result, int code, String msg){
        ResponseMessageProto.DownloadDataResponse.Builder downloadDataResponseBuilder = ResponseMessageProto.DownloadDataResponse.newBuilder();
        downloadDataResponseBuilder.setResult(result);
        downloadDataResponseBuilder.setCode(code);
        downloadDataResponseBuilder.setMsg(msg);

        ResponseMessage.Builder messageBuilder = ResponseMessage.newBuilder();
        messageBuilder.setCommandType(ResponseMessageProto.CommandType.DOWNLOAD_DATA_BACK);
        messageBuilder.setDownloadDataResponse(downloadDataResponseBuilder);
        return messageBuilder.build();
    }

    public static ResponseMessage createUploadRequest(String uid, String token, String sessionId, HashMap<String, String> data, int timeStamp){
        ResponseMessageProto.UploadDataRequest.Builder uploadDataRequestBuilder = ResponseMessageProto.UploadDataRequest.newBuilder();
        uploadDataRequestBuilder.setUid(uid);
        uploadDataRequestBuilder.setToken(token);
        uploadDataRequestBuilder.setSessionId(sessionId);
        uploadDataRequestBuilder.putAllData(data);
        uploadDataRequestBuilder.setTimeStamp(timeStamp);

        ResponseMessage.Builder messageBuilder = ResponseMessage.newBuilder();
        messageBuilder.setCommandType(ResponseMessageProto.CommandType.UPLOAD_DATA);
        messageBuilder.setUploadDataRequest(uploadDataRequestBuilder);
        return messageBuilder.build();
    }

    public static ResponseMessage createUploadResponse(boolean result, int code, String msg){
        ResponseMessageProto.UploadDataResponse.Builder uploadDataResponseBuilder = ResponseMessageProto.UploadDataResponse.newBuilder();
        uploadDataResponseBuilder.setResult(result);
        uploadDataResponseBuilder.setCode(code);
        uploadDataResponseBuilder.setMsg(msg);

        ResponseMessage.Builder messageBuilder = ResponseMessage.newBuilder();
        messageBuilder.setCommandType(ResponseMessageProto.CommandType.UPLOAD_DATA_BACK);
        messageBuilder.setUploadDataResponse(uploadDataResponseBuilder);
        return messageBuilder.build();
    }

    //TODO create EXIT EXIT_BACK messages
}
