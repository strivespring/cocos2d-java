package com.cocos2dj.module.base2d;

import com.badlogic.gdx.math.Vector2;
import com.cocos2dj.module.base2d.framework.PhysicsObject;
import com.cocos2dj.module.base2d.framework.PhysicsObjectType;
import com.cocos2dj.module.base2d.framework.callback.UpdateListener;
import com.cocos2dj.module.base2d.framework.collision.ContactCollisionData;
import com.cocos2dj.protocol.IComponent;
import com.cocos2dj.protocol.INode;
import com.cocos2dj.s2d.Node;

/**
 * ComponentPhysics.java
 * <br>CancelContactCallback
 * <br>ContactCreatedCallback
 * <br>ContactPersistedCallback
 * <br>ContactDestroyedCallback
 * <br>ContactCallback
 * <p>
 * 
 * 
 * @author Copyright(c) 2017 xu jun
 */
public class ComponentPhysics extends PhysicsObject implements IComponent, INode.OnTransformCallback, UpdateListener {
	
	public ComponentPhysics() {
		super();
	}
	
	public ComponentPhysics(PhysicsObjectType type) {
		super(type);
	}
	
	
	public final void setOwner(Node owner) {this._owner = owner;}
	public final Node getOwner() {return _owner;}
	public boolean isEnabled() {return _enabled;}
	public void setEnabled(boolean enabled) {_enabled = enabled;}
	public String getName() {return _name;}
	public void setName(String name) {_name = name;}
	
	protected Node 		_owner;
	protected String 	_name;
	protected boolean	_enabled;
	

	
	public ComponentPhysics bindNode(Node node) {
		node.addComponent(this);
		return this;
	}
	
	
	
	//override>>
	@Override
	public void update(float delta) {}

	@Override
	public void onEnter() {
		sleep = false;
	}

	@Override
	public void onExit() {
		sleep = true;
	}

	@Override
	public void onAdd() {
		_owner.setOnTransformCallback(this);
		setUserData(_owner);
		listener = this;
	}

	@Override
	public void onRemove() {
		_owner.setOnTransformCallback(null);
		setUserData(null);
		listener = null;
	}
	
	//node更新物理对象位置
	@Override
	public final void onTransform(INode n) {
		final Node parent = _owner.getParent();
		//转换到world坐标中设置
		if(parent != null) {
			Vector2 temp = parent.convertToWorldSpace(_owner.getPosition());
			this.setPosition(temp.x, temp.y);
		} else {
			Vector2 temp = _owner.getPosition();
			this.setPosition(temp.x, temp.y);
		}
	}
	
	//物理对象更新node位置
	@Override
	public final void onUpdatePosition(PhysicsObject o) {
		//需要转换为world坐标再设置更新
		final Node parent = _owner.getParent();
		if(parent != null) {
			_owner.setPosition(parent.convertToNodeSpace(o.getPosition()));
		} else {
			_owner.setPosition(o.getPosition());
		}
		_owner._setPhysicsCallFlag();
	}
	
	
	/**将要发生碰撞时调用
	 * @return false 碰撞继续 true取消碰撞 */
	public final boolean cancelContact(PhysicsObject o) {
		return _cancelContactCallback.cancelContact(this, (ComponentPhysics) o);
	}
	
	/**当接触创建时调用 */
	public final void contactCreated(PhysicsObject o, Vector2 MTD, ContactCollisionData data) {
		_contactCreatedCallback.onContactCreated(this, (ComponentPhysics) o, MTD, data);
	}
	/**当接触持续存在时调用 */
	public final void contactPersisted(PhysicsObject o, Vector2 MTD, ContactCollisionData data) {
		_contactPersistedCallback.onContactPersisted(this, (ComponentPhysics) o, MTD, data);
	}
	/**当接触撤销后调用 */
	public final void contactDestroyed(PhysicsObject o, Vector2 MTD, ContactCollisionData data) {
		_contactDestroyedCallback.onContactDestroyed(this, (ComponentPhysics) o, MTD, data);
	}
	
	///////////////////////////////
	public static interface CancelContactCallback {
		public boolean cancelContact(ComponentPhysics self, ComponentPhysics other);
		public static final CancelContactCallback NULL = new CancelContactCallback() {
			public boolean cancelContact(ComponentPhysics self, ComponentPhysics other) {
				return false;
			}
		};
	}
	
	public static interface ContactCreatedCallback {
		public void onContactCreated(ComponentPhysics self, ComponentPhysics other, Vector2 MTD, ContactCollisionData data);
		public static final ContactCreatedCallback NULL = new ContactCreatedCallback() {
			public void onContactCreated(ComponentPhysics self, ComponentPhysics other, Vector2 MTD, ContactCollisionData data) {
			}
		};
	}
	public static interface ContactPersistedCallback {
		public void onContactPersisted(ComponentPhysics self, ComponentPhysics other, Vector2 MTD, ContactCollisionData data);
		public static final ContactPersistedCallback NULL = new ContactPersistedCallback() {
			public void onContactPersisted(ComponentPhysics self, ComponentPhysics other, Vector2 MTD, ContactCollisionData data) {
			}
		};
	}
	public static interface ContactDestroyedCallback {
		public void onContactDestroyed(ComponentPhysics self, ComponentPhysics other, Vector2 MTD, ContactCollisionData data);
		public static final ContactDestroyedCallback NULL = new ContactDestroyedCallback() {
			public void onContactDestroyed(ComponentPhysics self, ComponentPhysics other, Vector2 MTD, ContactCollisionData data) {
			}
		};
	}
	
	public static interface ContactCallback extends ContactCreatedCallback, ContactPersistedCallback, ContactDestroyedCallback {}
	
	CancelContactCallback 			_cancelContactCallback = CancelContactCallback.NULL;
	ContactCreatedCallback			_contactCreatedCallback = ContactCreatedCallback.NULL;
	ContactPersistedCallback		_contactPersistedCallback = ContactPersistedCallback.NULL;
	ContactDestroyedCallback		_contactDestroyedCallback = ContactDestroyedCallback.NULL;
	
	
	public void setCancelContactCallback(CancelContactCallback callback) {
		_cancelContactCallback = callback != null ? callback : CancelContactCallback.NULL; 
	}
	public void setContactCreatedCallback(ContactCreatedCallback callback) {
		_contactCreatedCallback = callback != null ? callback : ContactCreatedCallback.NULL; 
	}
	public void setContactPersistedCallback(ContactPersistedCallback callback) {
		_contactPersistedCallback = callback != null ? callback : ContactPersistedCallback.NULL; 
	}
	public void setContactDestroyedCallback(ContactDestroyedCallback callback) {
		_contactDestroyedCallback = callback != null ? callback : ContactDestroyedCallback.NULL; 
	}
	
	public void setContactCallback(ContactCallback callback) {
		_contactCreatedCallback = callback;
		_contactPersistedCallback = callback;
		_contactDestroyedCallback = callback;
	}
}