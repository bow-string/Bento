package jp.rolengrays.bento;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.component.html.HtmlInputHidden;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import jp.rolengrays.bento.entity.BentoDummyEntity;

@SuppressWarnings("serial")
@ViewScoped
@Named
public class BentoManager implements Serializable{
	private List<BentoDummyEntity> bentos;
	
	// ボタンが押されたとき、押された行にある<h:inputHidden>要素がこのフィールドにbindingされる
	private HtmlInputHidden bought;
	
	private int boughtBentoId;
	
	@PostConstruct
	public void init() {
		/**
		 * ここではArrayListを使う。別に他のListの実装でもよい
		 */
		this.setBentos(new ArrayList<>());
		this.getBentos().add(new BentoDummyEntity(11, "のり弁当", 240));
		this.getBentos().add(new BentoDummyEntity(12, "唐揚げ弁当", 450));
		this.getBentos().add(new BentoDummyEntity(13, "焼肉弁当", 990));
	}
	
	public String buy() {
		// ボタンが押された行を表現しているBentoDummyEntityのIDを取得
		Integer bentoId = (Integer)this.getBought().getValue();
		this.setBoughtBentoId(bentoId);
		
		return "bento"+bentoId;
	}

	public List<BentoDummyEntity> getBentos() {
		return bentos;
	}

	public void setBentos(List<BentoDummyEntity> bentos) {
		this.bentos = bentos;
	}

	public HtmlInputHidden getBought() {
		return bought;
	}

	public void setBought(HtmlInputHidden bought) {
		this.bought = bought;
	}

	public int getBoughtBentoId() {
		return boughtBentoId;
	}

	public void setBoughtBentoId(int boughtBentoId) {
		this.boughtBentoId = boughtBentoId;
	}
}
