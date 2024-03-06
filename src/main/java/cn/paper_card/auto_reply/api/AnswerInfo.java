package cn.paper_card.auto_reply.api;

public record AnswerInfo(
        int id,
        String content,
        String category,
        long createTime
) {
}