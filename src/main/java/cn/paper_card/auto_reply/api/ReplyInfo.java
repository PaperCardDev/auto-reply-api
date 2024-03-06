package cn.paper_card.auto_reply.api;

import java.util.List;

public record ReplyInfo(
        List<WordInfo> words,

        WordGroupInfo wordGroupInfo,
        AnswerInfo answer
) {
}