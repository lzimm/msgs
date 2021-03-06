package com.qorporation.msgs.server.entity.definition;

import java.sql.Timestamp;

import com.qorporation.qluster.conn.sql.typesafety.SQLTable;
import com.qorporation.qluster.conn.sql.typesafety.keytypes.annotation.Indexed;
import com.qorporation.qluster.entity.Entity;
import com.qorporation.qluster.entity.typesafety.FieldKey;

public class Message extends SQLTable {

	@Indexed
	public static FieldKey<Entity<Conversation>> conversation;
	
	@Indexed
	public static FieldKey<Entity<User>> sender;
	
	public static FieldKey<String> body;
	public static FieldKey<Timestamp> time;
	
}
