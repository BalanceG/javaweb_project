package com.oracle.dao.impl;

import com.oracle.dao.BookmsgDao;
import com.oracle.entity.Bookmsg;
import com.oracle.util.DBManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookmsgDaoImpl extends DBManager implements BookmsgDao {
	@Override
	public List<Bookmsg> queryBybtypemsg_id(Integer btypemsg_id) throws SQLException {
		List<Bookmsg> list =new ArrayList<>();
		String sql="select * from bookmsg where \n" +
				"btypemsg_id = ?";
		try{
			ResultSet query = super.query(sql, btypemsg_id);
			while (query.next()){
				Bookmsg bookmsg=new Bookmsg();
				bookmsg.setBtypemsgId(query.getInt("Btypemsg_Id"));
				bookmsg.setLid(query.getInt("Lid"));
				bookmsg.setLname(query.getString("Lname"));
				bookmsg.setLPictre(query.getString("L_Pictre"));
				list.add(bookmsg);
			}

		}finally {
			super.close();
		}
		return list;
	}

	@Override
	public Bookmsg queryById(Integer lid) {
		return null;
	}

	@Override
	public long count(Bookmsg bookmsg) {
		return 0;
	}

	@Override
	public int insert(Bookmsg bookmsg) {
		return 0;
	}

	@Override
	public int update(Bookmsg bookmsg) {
		return 0;
	}

	@Override
	public int deleteById(Integer lid) {
		return 0;
	}
}
