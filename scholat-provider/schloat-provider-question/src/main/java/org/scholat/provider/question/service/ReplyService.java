package org.scholat.provider.question.service;

import java.util.List;

import org.scholat.provider.question.pojo.QuestionAndReply;
import org.scholat.provider.question.pojo.Reply;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/*
 * @author lsx
 * 回复Reply的service接口
 */
public interface ReplyService {

	//查找提问对应的评论
	List<Reply> findReply(Integer questionId);
	
	//删除评论
	void deleteReply(Integer replyId);
	
	//查找个人评论并显示提问的问题信息
	Page<QuestionAndReply> findReplyByUser(Integer userId,Pageable pageable);
	
	//发布评论
	void addReply(Reply reply);
	
}
