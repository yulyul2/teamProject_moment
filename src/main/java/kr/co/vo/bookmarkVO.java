package kr.co.vo;

public class bookmarkVO {

	String member_id;//로그인한 사용자 세션로그힌
	int post_no;//게시물 number
	int mark_check;
	
	
	
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public int getPost_no() {
		return post_no;
	}
	public void setPost_no(int post_no) {
		this.post_no = post_no;
	}
	public int getmark_check() {
		return mark_check;
	}
	public void setmark_check(int mark_check) {
		this.mark_check = mark_check;
	}

	
}
