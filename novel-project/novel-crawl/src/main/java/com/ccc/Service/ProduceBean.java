package com.ccc.Service;

import com.zzz.entity.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

//封装网页数据产生的bean,这些bean之后用mapper写入数据库
public class ProduceBean {
    @Autowired
    Book book;
    @Autowired
    BookAuthor bookAuthor;
    @Autowired
    BookCategory bookCategory;
    @Autowired
    BookComment bookComment;
    @Autowired
    BookCommentReply bookCommentReply;
    @Autowired
    BookContent bookContent;
    @Autowired
    BookIndex bookIndex;
    @Autowired
    BookScreenBullet bookScreenBullet;
    @Autowired
    BookSetting bookSetting;

    //从pipeline中的ResuleItems中拿数据填充完所有bean,生成一个可供Mybatis使用的bean
    public Book getBook(Long id, Byte workDirection, Integer catId, String catName, String picUrl, String bookName, Long authorId, String authorName, String bookDesc, Float score, Byte bookStatus, Long visitCount, Integer wordCount, Integer commentCount, Integer yesterdayBuy, Long lastIndexId, String lastIndexName, Date lastIndexUpdateTime,Byte isVip,Byte status,Date updateTime,Date createTime,Integer crawlSourceId,String crawlBookId,Date crawlLastTime,Byte crawlIsStop){
        book.setId(id);
        book.setWorkDirection(workDirection);
        book.setCatId(catId);
        book.setCatName(catName);
        book.setPicUrl(picUrl);
        book.setBookName(bookName);
        book.setAuthorId(authorId);
        book.setAuthorName(authorName);
        book.setBookDesc(bookDesc);
        book.setScore(score);
        book.setBookStatus(bookStatus);
        book.setVisitCount(visitCount);
        book.setWordCount(wordCount);
        book.setCommentCount(commentCount);
        book.setYesterdayBuy(yesterdayBuy);
        book.setLastIndexId(lastIndexId);
        book.setLastIndexUpdateTime(lastIndexUpdateTime);
        book.setIsVip(isVip);
        book.setStatus(status);
        book.setUpdateTime(updateTime);
        book.setCreateTime(createTime);
        book.setCrawlSourceId(crawlSourceId);
        book.setCrawlBookId(crawlBookId);
        book.setCrawlLastTime(crawlLastTime);
        book.setCrawlIsStop(crawlIsStop);
        book.setLastIndexName(lastIndexName);
        return book;
    }

    public BookAuthor getBookAuthor(Long id,String inviteCode,String penName,String telPhone,String chatAccount,String email,Byte workDirection,Byte status,Date createTime,Long createUserId,Date updateTime,Long updateUserId){
        bookAuthor.setId(id);
        bookAuthor.setInviteCode(inviteCode);
        bookAuthor.setPenName(penName);
        bookAuthor.setTelPhone(telPhone);
        bookAuthor.setChatAccount(chatAccount);
        bookAuthor.setEmail(email);
        bookAuthor.setWorkDirection(workDirection);
        bookAuthor.setStatus(status);
        bookAuthor.setCreateTime(createTime);
        bookAuthor.setCreateUserId(createUserId);
        bookAuthor.setUpdateTime(updateTime);
        bookAuthor.setUpdateUserId(updateUserId);
        return bookAuthor;
    }

    public BookCategory getBookCategory(Integer id,Byte workDirection,String name,Byte sort,Long createUserId,Date createTime,Long updateUserId,Date updateTime){
        bookCategory.setId(id);
        bookCategory.setWorkDirection(workDirection);
        bookCategory.setName(name);
        bookCategory.setSort(sort);
        bookCategory.setCreateTime(createTime);
        bookCategory.setCreateUserId(createUserId);
        bookCategory.setUpdateTime(updateTime);
        bookCategory.setUpdateUserId(updateUserId);
        return bookCategory;
    }

    public BookComment getBookComment(Long id,Long bookId,String commentContent,Integer replyCount,Byte auditStatus,Date createTime,Long createUserId){
        bookComment.setId(id);
        bookComment.setBookId(bookId);
        bookComment.setCommentContent(commentContent);
        bookComment.setReplyCount(replyCount);
        bookComment.setAuditStatus(auditStatus);
        bookComment.setCreateTime(createTime);
        bookComment.setCreateUserId(createUserId);
        return bookComment;
    }

    public BookCommentReply getBookCommentReply(Long id,Long commentId,String replyContent,Byte auditStatus,Date createTime,Long createUserId){
        bookCommentReply.setId(id);
        bookCommentReply.setCommentId(commentId);
        bookCommentReply.setReplyContent(replyContent);
        bookCommentReply.setAuditStatus(auditStatus);
        bookCommentReply.setCreateTime(createTime);
        bookCommentReply.setCreateUserId(createUserId);
        return bookCommentReply;
    }

    public BookContent getBookContent(Long id,Long indexId,String content){
        bookContent.setId(id);
        bookContent.setIndexId(indexId);
        bookContent.setContent(content);
        return bookContent;
    }

    public BookIndex getBookIndex(Long id,Long bookId,Integer indexNum,String indexName,Integer wordCount,Byte isVip,Integer bookPrice,Date createTime,Date updateTime){
        bookIndex.setId(id);
        bookIndex.setBookId(bookId);
        bookIndex.setIndexNum(indexNum);
        bookIndex.setIndexName(indexName);
        bookIndex.setWordCount(wordCount);
        bookIndex.setIsVip(isVip);
        bookIndex.setBookPrice(bookPrice);
        bookIndex.setCreateTime(createTime);
        bookIndex.setUpdateTime(updateTime);
        return bookIndex;
    }
    public BookScreenBullet getBookScreenBullet(Long id,Long contentId,String screenBullet,Date createTime){
        bookScreenBullet.setId(id);
        bookScreenBullet.setContentId(contentId);
        bookScreenBullet.setScreenBullet(screenBullet);
        bookScreenBullet.setCreateTime(createTime);
        return bookScreenBullet;
    }
    public BookSetting getBookSetting(Long id,Long bookId,Byte sort,Byte type,Date createTime,Long createUserId,Date updateTime,Long updateUserId){
        bookSetting.setId(id);
        bookSetting.setBookId(bookId);
        bookSetting.setSort(sort);
        bookSetting.setType(type);
        bookSetting.setCreateTime(createTime);
        bookSetting.setCreateUserId(createUserId);
        bookSetting.setUpdateTime(updateTime);
        bookSetting.setUpdateUserId(updateUserId);
        return bookSetting;
    }


}