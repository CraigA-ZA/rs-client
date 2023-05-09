package runestar.generated;

import accessors.generate.base.Accessor;
import accessors.generate.base.MethodExecution;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Void;
import java.util.Comparator;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/**
 * public abstract class
 */
public interface XUserList extends Accessor {
	/**
	 * @see XUserList#addComparator(Comparator)
	 */
	@NotNull
	MethodExecution<XUserList, Void> addComparator = new MethodExecution.Implementation();

	/**
	 * @see XUserList#addLast(XUsername, XUsername)
	 */
	@NotNull
	MethodExecution<XUserList, XUser> addLast = new MethodExecution.Implementation();

	/**
	 * @see XUserList#addLastNoPreviousUsername(XUsername)
	 */
	@NotNull
	MethodExecution<XUserList, XUser> addLastNoPreviousUsername = new MethodExecution.Implementation();

	/**
	 * @see XUserList#arrayAddLast(XUser)
	 */
	@NotNull
	MethodExecution<XUserList, Void> arrayAddLast = new MethodExecution.Implementation();

	/**
	 * @see XUserList#arrayRemove(int)
	 */
	@NotNull
	MethodExecution<XUserList, Void> arrayRemove = new MethodExecution.Implementation();

	/**
	 * @see XUserList#changeName(XUser, XUsername, XUsername)
	 */
	@NotNull
	MethodExecution<XUserList, Void> changeName = new MethodExecution.Implementation();

	/**
	 * @see XUserList#clear()
	 */
	@NotNull
	MethodExecution<XUserList, Void> clear = new MethodExecution.Implementation();

	/**
	 * @see XUserList#contains(XUsername)
	 */
	@NotNull
	MethodExecution<XUserList, Boolean> contains = new MethodExecution.Implementation();

	/**
	 * @see XUserList#get(int)
	 */
	@NotNull
	MethodExecution<XUserList, XUser> get = new MethodExecution.Implementation();

	/**
	 * @see XUserList#getByCurrentUsername(XUsername)
	 */
	@NotNull
	MethodExecution<XUserList, XUser> getByCurrentUsername = new MethodExecution.Implementation();

	/**
	 * @see XUserList#getByPreviousUsername(XUsername)
	 */
	@NotNull
	MethodExecution<XUserList, XUser> getByPreviousUsername = new MethodExecution.Implementation();

	/**
	 * @see XUserList#getByUsername(XUsername)
	 */
	@NotNull
	MethodExecution<XUserList, XUser> getByUsername = new MethodExecution.Implementation();

	/**
	 * @see XUserList#indexOf(XUser)
	 */
	@NotNull
	MethodExecution<XUserList, Integer> indexOf = new MethodExecution.Implementation();

	/**
	 * @see XUserList#isFull()
	 */
	@NotNull
	MethodExecution<XUserList, Boolean> isFull = new MethodExecution.Implementation();

	/**
	 * @see XUserList#mapPut(XUser)
	 */
	@NotNull
	MethodExecution<XUserList, Void> mapPut = new MethodExecution.Implementation();

	/**
	 * @see XUserList#mapRemove(XUser)
	 */
	@NotNull
	MethodExecution<XUserList, Void> mapRemove = new MethodExecution.Implementation();

	/**
	 * @see XUserList#remove(XUser)
	 */
	@NotNull
	MethodExecution<XUserList, Void> remove = new MethodExecution.Implementation();

	/**
	 * @see XUserList#removeByUsername(XUsername)
	 */
	@NotNull
	MethodExecution<XUserList, Boolean> removeByUsername = new MethodExecution.Implementation();

	/**
	 * @see XUserList#removeComparator()
	 */
	@NotNull
	MethodExecution<XUserList, Void> removeComparator = new MethodExecution.Implementation();

	/**
	 * @see XUserList#size()
	 */
	@NotNull
	MethodExecution<XUserList, Integer> size = new MethodExecution.Implementation();

	/**
	 * @see XUserList#sort()
	 */
	@NotNull
	MethodExecution<XUserList, Void> sort = new MethodExecution.Implementation();

	/**
	 *  field
	 */
	XUser[] getArray();

	/**
	 *  field
	 */
	void setArray(XUser[] value);

	/**
	 * final field
	 */
	int getCapacity();

	/**
	 *  field
	 */
	Comparator getComparator();

	/**
	 *  field
	 */
	void setComparator(Comparator value);

	/**
	 *  field
	 */
	HashMap getPreviousUsernamesMap();

	/**
	 *  field
	 */
	void setPreviousUsernamesMap(HashMap value);

	/**
	 *  field
	 */
	int getSize0();

	/**
	 *  field
	 */
	void setSize0(int value);

	/**
	 *  field
	 */
	HashMap getUsernamesMap();

	/**
	 *  field
	 */
	void setUsernamesMap(HashMap value);

	/**
	 * public final method
	 */
	void addComparator(Comparator c);

	/**
	 *  method
	 */
	XUser addLast(XUsername username, XUsername previousUsername);

	/**
	 *  method
	 */
	XUser addLastNoPreviousUsername(XUsername username);

	/**
	 * final method
	 */
	void arrayAddLast(XUser user);

	/**
	 * final method
	 */
	void arrayRemove(int index);

	/**
	 * final method
	 */
	void changeName(XUser user, XUsername username, XUsername previousUsername);

	/**
	 * public method
	 */
	void clear();

	/**
	 * public method
	 */
	boolean contains(XUsername username);

	/**
	 * public final method
	 */
	XUser get(int index);

	/**
	 *  method
	 */
	XUser getByCurrentUsername(XUsername username);

	/**
	 *  method
	 */
	XUser getByPreviousUsername(XUsername previousUsername);

	/**
	 * public method
	 */
	XUser getByUsername(XUsername username);

	/**
	 * final method
	 */
	int indexOf(XUser user);

	/**
	 * public method
	 */
	boolean isFull();

	/**
	 * final method
	 */
	void mapPut(XUser user);

	/**
	 * final method
	 */
	void mapRemove(XUser user);

	/**
	 * abstract method
	 */
	XUser newInstance();

	/**
	 * abstract method
	 */
	XUser[] newTypedArray(int size);

	/**
	 * final method
	 */
	void remove(XUser user);

	/**
	 * public final method
	 */
	boolean removeByUsername(XUsername username);

	/**
	 * public final method
	 */
	void removeComparator();

	/**
	 * public method
	 */
	int size();

	/**
	 * public final method
	 */
	void sort();
}
