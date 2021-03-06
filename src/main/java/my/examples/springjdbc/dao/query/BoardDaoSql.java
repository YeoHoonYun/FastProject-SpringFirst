package my.examples.springjdbc.dao.query;

/**
 * Created by cjswo9207u@gmail.com on 2019-01-25
 * Github : https://github.com/YeoHoonYun
 */
public class BoardDaoSql {
    public static final String SELECT_BY_ID =
            "select id, title, nickname, content, regdate, file_path, read_count,groupno,grpord,depth " +
                    "from board " +
                    "where id = :id";
    public static final String SELECT_BY_PAGING =
            "select id, title, nickname, regdate, read_count, depth " +
                    "from board " +
                    "order by groupno desc, grpord limit :startNum, :endNum";
    public static final String LAST_ID =
            "UPDATE board SET groupno = LAST_INSERT_ID() where id = ?";
    public static final String INSERT =
            "insert into board(title,user_id,nickname,content,groupno                ,grpord,depth,file_path) " +
                    "   select ?    ,      ?,       ?,      ?,0,1        ,0     ,1    ,? from board limit 1";
    public static final String UPDATE =
            "UPDATE board SET title = ?, content = ?, file_path = ? WHERE id = ?";
    public static final String DELETE =
            "delete from board where id = ?";
    public static final String UPDATE_COUNT =
            "UPDATE board SET read_count = read_count + 1 WHERE id = ?";
    public static final String UPDATE_GRPORD =
            "UPDATE board SET grpord = grpord + 1 where groupno = ? and grpord >= ? + 1";
    public static final String INSERT_GROUP =
            "insert into board (title,user_id,nickname,content,groupno,grpord,depth) " +
                    "    values (?    ,?      , ?     , ?      , ?      ,? + 1    ,? + 1)";
    public static final String PRE =
            "SELECT id FROM board WHERE id > ? ORDER BY id LIMIT 1";
    public static final String BEFOR =
            "SELECT id FROM board WHERE id < ? ORDER BY id DESC LIMIT 1";
    public static final String SELECT_BY_WORD =
            "select id, title, nickname, regdate, read_count, depth " +
                    "from board " +
                    "where title like :word" +
                    "order by groupno desc, grpord limit :startNum, :endNum";
    public static final String BOARD_VIEW_SELECT =
            "select count_id from boardview";
}
