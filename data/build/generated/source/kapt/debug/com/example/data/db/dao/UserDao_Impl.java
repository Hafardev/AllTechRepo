package com.example.data.db.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.data.db.convertor.UserOwnerRepositoryItemConvertor;
import com.example.data.entityModel.userRepo.UserOwnerRepositoryItem;
import com.example.data.entityModel.userRepo.UserRepositoryItem;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserRepositoryItem> __insertionAdapterOfUserRepositoryItem;

  private final UserOwnerRepositoryItemConvertor __userOwnerRepositoryItemConvertor = new UserOwnerRepositoryItemConvertor();

  private final EntityDeletionOrUpdateAdapter<UserRepositoryItem> __deletionAdapterOfUserRepositoryItem;

  private final EntityDeletionOrUpdateAdapter<UserRepositoryItem> __updateAdapterOfUserRepositoryItem;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserRepositoryItem = new EntityInsertionAdapter<UserRepositoryItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `user_fav_item` (`id`,`name`,`fullName`,`owner`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserRepositoryItem value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getFullName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFullName());
        }
        final String _tmp = __userOwnerRepositoryItemConvertor.toJson(value.getOwner());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
      }
    };
    this.__deletionAdapterOfUserRepositoryItem = new EntityDeletionOrUpdateAdapter<UserRepositoryItem>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `user_fav_item` WHERE `name` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserRepositoryItem value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
      }
    };
    this.__updateAdapterOfUserRepositoryItem = new EntityDeletionOrUpdateAdapter<UserRepositoryItem>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `user_fav_item` SET `id` = ?,`name` = ?,`fullName` = ?,`owner` = ? WHERE `name` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserRepositoryItem value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getFullName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFullName());
        }
        final String _tmp = __userOwnerRepositoryItemConvertor.toJson(value.getOwner());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
        if (value.getName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getName());
        }
      }
    };
  }

  @Override
  public Object createUserFavList(final UserRepositoryItem data,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUserRepositoryItem.insert(data);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteUserFavList(final UserRepositoryItem data,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfUserRepositoryItem.handle(data);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateUserFavList(final UserRepositoryItem data,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfUserRepositoryItem.handle(data);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<UserRepositoryItem>> readUserFavList() {
    final String _sql = "SELECT * FROM user_fav_item ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"user_fav_item"}, new Callable<List<UserRepositoryItem>>() {
      @Override
      public List<UserRepositoryItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "fullName");
          final int _cursorIndexOfOwner = CursorUtil.getColumnIndexOrThrow(_cursor, "owner");
          final List<UserRepositoryItem> _result = new ArrayList<UserRepositoryItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final UserRepositoryItem _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpFullName;
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _tmpFullName = null;
            } else {
              _tmpFullName = _cursor.getString(_cursorIndexOfFullName);
            }
            final UserOwnerRepositoryItem _tmpOwner;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfOwner)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfOwner);
            }
            _tmpOwner = __userOwnerRepositoryItemConvertor.fromJson(_tmp);
            _item = new UserRepositoryItem(_tmpId,_tmpName,_tmpFullName,_tmpOwner);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
