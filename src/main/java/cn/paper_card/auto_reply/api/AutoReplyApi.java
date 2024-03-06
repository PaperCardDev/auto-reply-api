package cn.paper_card.auto_reply.api;

import org.jetbrains.annotations.NotNull;

import java.util.List;

@SuppressWarnings("unused")
public interface AutoReplyApi {

    @NotNull
    List<ReplyInfo> queryAnswer(String question) throws Exception;
}
