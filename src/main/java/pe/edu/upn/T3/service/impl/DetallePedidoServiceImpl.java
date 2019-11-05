package pe.edu.upn.T3.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.T3.model.entity.DetallePedido;
import pe.edu.upn.T3.model.repository.DetallePedidoRepository;
import pe.edu.upn.T3.service.DetallePedidoService;

@Service
public class DetallePedidoServiceImpl implements DetallePedidoService{

	@Autowired
	private DetallePedidoRepository detallePedidoRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<DetallePedido> findAll() throws Exception {
		return detallePedidoRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<DetallePedido> findById(Integer id) throws Exception {
		return detallePedidoRepository.findById(id);
	}

	@Transactional
	@Override
	public DetallePedido save(DetallePedido entity) throws Exception {
		return detallePedidoRepository.save(entity);
	}
	
	@Transactional
	@Override
	public DetallePedido update(DetallePedido entity) throws Exception {
		return detallePedidoRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		detallePedidoRepository.deleteById(id);
		
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		detallePedidoRepository.deleteAll();
		
	}

}
