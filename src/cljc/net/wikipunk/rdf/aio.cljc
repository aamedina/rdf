(ns net.wikipunk.rdf.aio
  {:dcat/downloadURL "net/wikipunk/ext/aio.owl",
   :namespaces       {"aio" "http://purl.obolibrary.org/obo/aio.owl#",
                      "dc11" "http://purl.org/dc/elements/1.1/",
                      "dcterms" "http://purl.org/dc/terms/",
                      "obo" "http://purl.obolibrary.org/obo/",
                      "oboInOwl"
                      "http://www.geneontology.org/formats/oboInOwl#",
                      "owl" "http://www.w3.org/2002/07/owl#",
                      "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                      "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                      "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :private          true,
   :rdf/type         :owl/Ontology,
   :rdfa/prefix      "aio",
   :rdfa/uri         "https://w3id.org/aio/"})

(def AE
  {:db/ident :aio/AE,
   :rdf/type :owl/Class})

(def ANN
  {:db/ident :aio/ANN,
   :rdf/type :owl/Class})

(def AbstractRNNCell
  {:db/ident :aio/AbstractRNNCell,
   :obo/IAO_0000115
   "Abstract object representing an RNN cell. This is the base class for implementing RNN cells with custom behavior.",
   :rdf/type :owl/Class,
   :rdfs/label "AbstractRNNCell",
   :rdfs/subClassOf :aio/Layer})

(def Activation_Layer
  {:db/ident        :aio/Activation_Layer,
   :obo/IAO_0000115 "Applies an activation function to an output.",
   :rdf/type        :owl/Class,
   :rdfs/label      "Activation Layer",
   :rdfs/subClassOf :aio/Layer})

(def Active_Learning
  {:db/ident :aio/Active_Learning,
   :obo/IAO_0000115
   "Methods which can interactively query a user (or some other information source) to label new data points with the desired outputs.",
   :oboInOwl/hasExactSynonym "Query Learning",
   :rdf/type :owl/Class,
   :rdfs/label "Active Learning",
   :rdfs/subClassOf :aio/Machine_Learning})

(def ActivityRegularization_Layer
  {:db/ident :aio/ActivityRegularization_Layer,
   :obo/IAO_0000115
   "Layer that applies an update to the cost function based input activity.",
   :rdf/type :owl/Class,
   :rdfs/label "ActivityRegularization Layer",
   :rdfs/subClassOf :aio/Regularization_Layer})

(def Activity_Bias
  {:db/ident :aio/Activity_Bias,
   :obo/IAO_0000115
   "A type of selection bias that occurs when systems/platforms get their training data from their most active users, rather than those less active (or inactive).",
   :rdf/type :owl/Class,
   :rdfs/label "Activity Bias",
   :rdfs/subClassOf :aio/Use_And_Interpretation_Bias})

(def AdaptiveAvgPool1D_Layer
  {:db/ident :aio/AdaptiveAvgPool1D_Layer,
   :obo/IAO_0000115
   "Applies a 1D adaptive average pooling over an input signal composed of several input planes.",
   :oboInOwl/hasExactSynonym #{"AdaptiveAvgPool1d" "AdaptiveAvgPool1D"},
   :rdf/type :owl/Class,
   :rdfs/label "AdaptiveAvgPool1D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def AdaptiveAvgPool2D_Layer
  {:db/ident :aio/AdaptiveAvgPool2D_Layer,
   :obo/IAO_0000115
   "Applies a 2D adaptive average pooling over an input signal composed of several input planes.",
   :oboInOwl/hasExactSynonym #{"AdaptiveAvgPool2D" "AdaptiveAvgPool2d"},
   :rdf/type :owl/Class,
   :rdfs/label "AdaptiveAvgPool2D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def AdaptiveAvgPool3D_Layer
  {:db/ident :aio/AdaptiveAvgPool3D_Layer,
   :obo/IAO_0000115
   "Applies a 3D adaptive average pooling over an input signal composed of several input planes.",
   :oboInOwl/hasExactSynonym #{"AdaptiveAvgPool3d" "AdaptiveAvgPool3D"},
   :rdf/type :owl/Class,
   :rdfs/label "AdaptiveAvgPool3D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def AdaptiveMaxPool1D_Layer
  {:db/ident :aio/AdaptiveMaxPool1D_Layer,
   :obo/IAO_0000115
   "Applies a 1D adaptive max pooling over an input signal composed of several input planes.",
   :oboInOwl/hasExactSynonym #{"AdaptiveMaxPool1d" "AdaptiveMaxPool1D"},
   :rdf/type :owl/Class,
   :rdfs/label "AdaptiveMaxPool1D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def AdaptiveMaxPool2D_Layer
  {:db/ident :aio/AdaptiveMaxPool2D_Layer,
   :obo/IAO_0000115
   "Applies a 2D adaptive max pooling over an input signal composed of several input planes.",
   :oboInOwl/hasExactSynonym #{"AdaptiveMaxPool2d" "AdaptiveMaxPool2D"},
   :rdf/type :owl/Class,
   :rdfs/label "AdaptiveMaxPool2D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def AdaptiveMaxPool3D_Layer
  {:db/ident :aio/AdaptiveMaxPool3D_Layer,
   :obo/IAO_0000115
   "Applies a 3D adaptive max pooling over an input signal composed of several input planes.",
   :oboInOwl/hasExactSynonym #{"AdaptiveMaxPool3D" "AdaptiveMaxPool3d"},
   :rdf/type :owl/Class,
   :rdfs/label "AdaptiveMaxPool3D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def Add_Layer
  {:db/ident :aio/Add_Layer,
   :obo/IAO_0000115
   "Layer that adds a list of inputs. It takes as input a list of tensors, all of the same shape, and returns a single tensor (also of the same shape).",
   :rdf/type :owl/Class,
   :rdfs/label "Add Layer",
   :rdfs/subClassOf :aio/Merging_Layer})

(def AdditiveAttention_Layer
  {:db/ident :aio/AdditiveAttention_Layer,
   :obo/IAO_0000115
   "Additive attention layer, a.k.a. Bahdanau-style attention.",
   :rdf/type :owl/Class,
   :rdfs/label "AdditiveAttention Layer",
   :rdfs/subClassOf :aio/Attention_Layer})

(def AlphaDropout_Layer
  {:db/ident :aio/AlphaDropout_Layer,
   :obo/IAO_0000115
   "Applies Alpha Dropout to the input. Alpha Dropout is a Dropout that keeps mean and variance of inputs to their original values, in order to ensure the self-normalizing property even after this dropout. Alpha Dropout fits well to Scaled Exponential Linear Units by randomly setting activations to the negative saturation value.",
   :rdf/type :owl/Class,
   :rdfs/label "AlphaDropout Layer",
   :rdfs/subClassOf :aio/Regularization_Layer})

(def Amplification_Bias
  {:db/ident :aio/Amplification_Bias,
   :obo/IAO_0000115
   "Arises when the distribution over prediction outputs is skewed in comparison to the prior distribution of the prediction target.",
   :rdf/type :owl/Class,
   :rdfs/label "Amplification Bias",
   :rdfs/subClassOf :aio/Processing_Bias})

(def Anchoring_Bias
  {:db/ident :aio/Anchoring_Bias,
   :obo/IAO_0000115
   "A cognitive bias, the influence of a particular reference point or anchor on people’s decisions. Often more fully referred to as anchoring-and-adjustment, or anchoring-and-adjusting: after an anchor is set, people adjust insufficiently from that anchor point to arrive at a final answer. Decision makers are biased towards an initially presented value.",
   :rdf/type :owl/Class,
   :rdfs/label "Anchoring Bias",
   :rdfs/subClassOf :aio/Individual_Bias})

(def Annotator_Reporting_Bias
  {:db/ident :aio/Annotator_Reporting_Bias,
   :obo/IAO_0000115
   "When users rely on automation as a heuristic replacement for their own information seeking and processing. A form of individual bias but often discussed as a group bias, or the larger effects on natural language processing models.",
   :rdf/type :owl/Class,
   :rdfs/label "Annotator Reporting Bias",
   :rdfs/subClassOf :aio/Individual_Bias})

(def Artificial_Neural_Network
  {:db/ident :aio/Artificial_Neural_Network,
   :obo/IAO_0000115
   "An ANN is based on a collection of connected units or nodes called artificial neurons, which loosely model the neurons in a biological brain. Each connection, like the synapses in a biological brain, can transmit a signal to other neurons. An artificial neuron receives a signal then processes it and can signal neurons connected to it. The \"signal\" at a connection is a real number, and the output of each neuron is computed by some non-linear function of the sum of its inputs. The connections are called edges. Neurons and edges typically have a weight that adjusts as Learning proceeds. The weight increases or decreases the strength of the signal at a connection. Neurons may have a threshold such that a signal is sent only if the aggregate signal crosses that threshold. Typically, neurons are aggregated into layers. Different layers may perform different transformations on their inputs. Signals travel from the first layer (the input layer), to the last layer (the output layer), possibly after traversing the layers multiple times.",
   :oboInOwl/hasExactSynonym #{"ANN" "NN"},
   :rdf/type :owl/Class,
   :rdfs/label "Artificial Neural Network",
   :rdfs/subClassOf :aio/Network})

(def Association_Rule_Learning
  {:db/ident :aio/Association_Rule_Learning,
   :obo/IAO_0000115
   "A rule-based machine learning method for discovering interesting relations between variables in large databases. It is intended to identify strong rules discovered in databases using some measures of interestingness.",
   :rdf/type :owl/Class,
   :rdfs/label "Association Rule Learning",
   :rdfs/subClassOf :aio/Supervised_Learning})

(def Attention_Layer
  {:db/ident :aio/Attention_Layer,
   :obo/IAO_0000115
   "Dot-product attention layer, a.k.a. Luong-style attention.",
   :rdf/type :owl/Class,
   :rdfs/label "Attention Layer",
   :rdfs/subClassOf :aio/Layer})

(def Auto_Encoder_Network
  {:db/ident :aio/Auto_Encoder_Network,
   :obo/IAO_0000115
   "An autoencoder is a type of artificial neural network used to learn efficient codings of unlabeled data (unsupervised Learning). The encoding is validated and refined by attempting to regenerate the input from the encoding. The autoencoder learns a representation (encoding) for a set of data, typically for dimensionality reduction, by training the network to ignore insignificant data (“noise”). (https://en.wikipedia.org/wiki/Autoencoder)",
   :oboInOwl/hasExactSynonym "AE",
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Hidden, Matched Output-Input",
   :rdfs/label "Auto Encoder Network",
   :rdfs/subClassOf :aio/UPN})

(def Automation_Complacency_Bias
  {:db/ident :aio/Automation_Complacency_Bias,
   :obo/IAO_0000115
   "When humans over-rely on automated systems or have their skills attenuated by such over-reliance (e.g., spelling and autocorrect or spellcheckers).",
   :oboInOwl/hasExactSynonym "Automation Complaceny",
   :rdf/type :owl/Class,
   :rdfs/label "Automation Complacency Bias",
   :rdfs/subClassOf :aio/Individual_Bias})

(def Availability_Heuristic_Bias
  {:db/ident :aio/Availability_Heuristic_Bias,
   :obo/IAO_0000115
   "A mental shortcut whereby people tend to overweight what comes easily or quickly to mind, meaning that what is easier to recall—e.g., more “available”—receives greater emphasis in judgement and decision-making.",
   :oboInOwl/hasExactSynonym #{"Availability Bias" "Availability Heuristic"},
   :rdf/type :owl/Class,
   :rdfs/label "Availability Heuristic Bias",
   :rdfs/subClassOf :aio/Individual_Bias})

(def AveragePooling1D_Layer
  {:db/ident :aio/AveragePooling1D_Layer,
   :obo/IAO_0000115
   "Average pooling for temporal data. Downsamples the input representation by taking the average value over the window defined by pool_size. The window is shifted by strides. The resulting output when using \"valid\" padding option has a shape of: output_shape = (input_shape - pool_size + 1) / strides). The resulting output shape when using the \"same\" padding option is: output_shape = input_shape / strides.",
   :oboInOwl/hasExactSynonym #{"AvgPool1d" "AvgPool1D"},
   :rdf/type :owl/Class,
   :rdfs/label "AveragePooling1D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def AveragePooling2D_Layer
  {:db/ident :aio/AveragePooling2D_Layer,
   :obo/IAO_0000115
   "Average pooling operation for spatial data. Downsamples the input along its spatial dimensions (height and width) by taking the average value over an input window (of size defined by pool_size) for each channel of the input. The window is shifted by strides along each dimension. The resulting output when using \"valid\" padding option has a shape (number of rows or columns) of: output_shape = math.floor((input_shape - pool_size) / strides) + 1 (when input_shape >= pool_size). The resulting output shape when using the \"same\" padding option is: output_shape = math.floor((input_shape - 1) / strides) + 1.",
   :oboInOwl/hasExactSynonym #{"AvgPool2D" "AvgPool2d"},
   :rdf/type :owl/Class,
   :rdfs/label "AveragePooling2D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def AveragePooling3D_Layer
  {:db/ident :aio/AveragePooling3D_Layer,
   :obo/IAO_0000115
   "Average pooling operation for 3D data (spatial or spatio-temporal). Downsamples the input along its spatial dimensions (depth, height, and width) by taking the average value over an input window (of size defined by pool_size) for each channel of the input. The window is shifted by strides along each dimension.",
   :oboInOwl/hasExactSynonym #{"AvgPool3D" "AvgPool3d"},
   :rdf/type :owl/Class,
   :rdfs/label "AveragePooling3D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def Average_Layer
  {:db/ident :aio/Average_Layer,
   :obo/IAO_0000115
   "Layer that averages a list of inputs element-wise. It takes as input a list of tensors, all of the same shape, and returns a single tensor (also of the same shape).",
   :rdf/type :owl/Class,
   :rdfs/label "Average Layer",
   :rdfs/subClassOf :aio/Merging_Layer})

(def AvgPool1D_Layer
  {:db/ident :aio/AvgPool1D_Layer,
   :obo/IAO_0000115
   "Applies a 1D average pooling over an input signal composed of several input planes.",
   :oboInOwl/hasExactSynonym #{"AvgPool1d" "AvgPool1D"},
   :rdf/type :owl/Class,
   :rdfs/label "AvgPool1D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def AvgPool2D_Layer
  {:db/ident :aio/AvgPool2D_Layer,
   :obo/IAO_0000115
   "Applies a 2D average pooling over an input signal composed of several input planes.",
   :oboInOwl/hasExactSynonym #{"AvgPool2D" "AvgPool2d"},
   :rdf/type :owl/Class,
   :rdfs/label "AvgPool2D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def AvgPool3D_Layer
  {:db/ident :aio/AvgPool3D_Layer,
   :obo/IAO_0000115
   "Applies a 3D average pooling over an input signal composed of several input planes.",
   :oboInOwl/hasExactSynonym #{"AvgPool3D" "AvgPool3d"},
   :rdf/type :owl/Class,
   :rdfs/label "AvgPool3D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def BM
  {:db/ident :aio/BM,
   :rdf/type :owl/Class})

(def BatchNorm1D_Layer
  {:db/ident :aio/BatchNorm1D_Layer,
   :obo/IAO_0000115
   "Applies Batch Normalization over a 2D or 3D input as described in the paper Batch Normalization: Accelerating Deep Network Training by Reducing Internal Covariate Shift .",
   :oboInOwl/hasExactSynonym #{"BatchNorm1d" "BatchNorm1D" "nn.BatchNorm1d"},
   :rdf/type :owl/Class,
   :rdfs/label "BatchNorm1D Layer",
   :rdfs/subClassOf :aio/BatchNormalization_Layer})

(def BatchNorm2D_Layer
  {:db/ident :aio/BatchNorm2D_Layer,
   :obo/IAO_0000115
   "Applies Batch Normalization over a 4D input (a mini-batch of 2D inputs with additional channel dimension) as described in the paper Batch Normalization: Accelerating Deep Network Training by Reducing Internal Covariate Shift .",
   :oboInOwl/hasExactSynonym #{"nn.BatchNorm2d" "BatchNorm2d" "BatchNorm2D"},
   :rdf/type :owl/Class,
   :rdfs/label "BatchNorm2D Layer",
   :rdfs/subClassOf :aio/BatchNormalization_Layer})

(def BatchNorm3D_Layer
  {:db/ident :aio/BatchNorm3D_Layer,
   :obo/IAO_0000115
   "Applies Batch Normalization over a 5D input (a mini-batch of 3D inputs with additional channel dimension) as described in the paper Batch Normalization: Accelerating Deep Network Training by Reducing Internal Covariate Shift .",
   :oboInOwl/hasExactSynonym #{"nn.BatchNorm3d" "BatchNorm3D" "BatchNorm3d"},
   :rdf/type :owl/Class,
   :rdfs/label "BatchNorm3D Layer",
   :rdfs/subClassOf :aio/BatchNormalization_Layer})

(def BatchNormalization_Layer
  {:db/ident :aio/BatchNormalization_Layer,
   :obo/IAO_0000115
   "Layer that normalizes its inputs. Batch normalization applies a transformation that maintains the mean output close to 0 and the output standard deviation close to 1. Importantly, batch normalization works differently during training and during inference. During training (i.e. when using fit() or when calling the layer/model with the argument training=True), the layer normalizes its output using the mean and standard deviation of the current batch of inputs. That is to say, for each channel being normalized, the layer returns gamma * (batch - mean(batch)) / sqrt(var(batch) + epsilon) + beta, where: epsilon is small constant (configurable as part of the constructor arguments), gamma is a learned scaling factor (initialized as 1), which can be disabled by passing scale=False to the constructor. beta is a learned offset factor (initialized as 0), which can be disabled by passing center=False to the constructor. During inference (i.e. when using evaluate() or predict() or when calling the layer/model with the argument training=False (which is the default), the layer normalizes its output using a moving average of the mean and standard deviation of the batches it has seen during training. That is to say, it returns gamma * (batch - self.moving_mean) / sqrt(self.moving_var + epsilon) + beta. self.moving_mean and self.moving_var are non-trainable variables that are updated each time the layer in called in training mode, as such: moving_mean = moving_mean * momentum + mean(batch) * (1 - momentum) moving_var = moving_var * momentum + var(batch) * (1 - momentum).",
   :rdf/type :owl/Class,
   :rdfs/label "BatchNormalization Layer",
   :rdfs/subClassOf :aio/Normalization_Layer})

(def Bayesian_Network
  {:db/ident :aio/Bayesian_Network,
   :obo/IAO_0000115
   "A probabilistic graphical model that represents a set of variables and their conditional dependencies via a directed acyclic graph (DAG).",
   :rdf/type :owl/Class,
   :rdfs/label "Bayesian Network",
   :rdfs/subClassOf :aio/Network})

(def Behavioral_Bias
  {:db/ident :aio/Behavioral_Bias,
   :obo/IAO_0000115
   "Systematic distortions in user behavior across platforms or contexts, or across users represented in different datasets.",
   :rdf/type :owl/Class,
   :rdfs/label "Behavioral Bias",
   :rdfs/subClassOf :aio/Individual_Bias})

(def Bias
  {:db/ident :aio/Bias,
   :obo/IAO_0000115
   "Systematic error introduced into sampling or testing by selecting or encouraging one outcome or answer over others.",
   :rdf/type :owl/Class,
   :rdfs/label "Bias"})

(def Biclustering
  {:db/ident :aio/Biclustering,
   :obo/IAO_0000115
   "Methods that simultaneously cluster the rows and columns of a matrix.",
   :oboInOwl/hasExactSynonym #{"Two-way Clustering" "Block Clustering"
                               "Co-clustering" "Two-mode Clustering"
                               "Joint Clustering"},
   :rdf/type :owl/Class,
   :rdfs/label "Biclustering",
   :rdfs/subClassOf :aio/Machine_Learning})

(def Bidirectional_Layer
  {:db/ident        :aio/Bidirectional_Layer,
   :obo/IAO_0000115 "Bidirectional wrapper for RNNs.",
   :rdf/type        :owl/Class,
   :rdfs/label      "Bidirectional Layer",
   :rdfs/subClassOf :aio/Recurrent_Layer})

(def Binary_Classification
  {:db/ident :aio/Binary_Classification,
   :obo/IAO_0000115
   "Methods that classify the elements of a set into two groups (each called class) on the basis of a classification rule.",
   :rdf/type :owl/Class,
   :rdfs/label "Binary Classification",
   :rdfs/subClassOf :aio/Classification})

(def Boltzmann_Machine_Network
  {:db/ident :aio/Boltzmann_Machine_Network,
   :obo/IAO_0000115
   "A Boltzmann machine is a type of stochastic recurrent neural network. It is a Markov random field. It was translated from statistical physics for use in cognitive science. The Boltzmann machine is based on a stochastic spin-glass model with an external field, i.e., a Sherrington–Kirkpatrick model that is a stochastic Ising Model[2] and applied to machine Learning.",
   :oboInOwl/hasExactSynonym
   #{"stochastic Ising-Lenz-Little model" "BM"
     "Sherrington–Kirkpatrick model with external field"
     "stochastic Hopfield network with hidden units"},
   :rdf/type :owl/Class,
   :rdfs/comment "Backfed Input, Probabilistic Hidden",
   :rdfs/label "Boltzmann Machine Network",
   :rdfs/subClassOf :aio/SCN})

(def Categorical_Features_Preprocessing_Layer
  {:db/ident :aio/Categorical_Features_Preprocessing_Layer,
   :obo/IAO_0000115
   "A layer that performs categorical data preprocessing operations.",
   :rdf/type :owl/Class,
   :rdfs/label "Categorical Features Preprocessing Layer",
   :rdfs/subClassOf :aio/Layer})

(def CategoryEncoding_Layer
  {:db/ident :aio/CategoryEncoding_Layer,
   :obo/IAO_0000115
   "A preprocessing layer which encodes integer features. This layer provides options for condensing data into a categorical encoding when the total number of tokens are known in advance. It accepts integer values as inputs, and it outputs a dense or sparse representation of those inputs. For integer inputs where the total number of tokens is not known, use tf.keras.layers.IntegerLookup instead.",
   :rdf/type :owl/Class,
   :rdfs/label "CategoryEncoding Layer",
   :rdfs/subClassOf :aio/Categorical_Features_Preprocessing_Layer})

(def Causal_Graphical_Model
  {:db/ident :aio/Causal_Graphical_Model,
   :obo/IAO_0000115
   "Probabilistic graphical models used to encode assumptions about the data-generating process.",
   :oboInOwl/hasExactSynonym #{"DAG" "Casaul Bayesian Network" "Path Diagram"
                               "Casaul Graph" "Directed Acyclic Graph"},
   :rdf/type :owl/Class,
   :rdfs/label "Causal Graphical Model",
   :rdfs/subClassOf :aio/Probabilistic_Graphical_Model})

(def CenterCrop_Layer
  {:db/ident :aio/CenterCrop_Layer,
   :obo/IAO_0000115
   "A preprocessing layer which crops images. This layers crops the central portion of the images to a target size. If an image is smaller than the target size, it will be resized and cropped so as to return the largest possible window in the image that matches the target aspect ratio. Input pixel values can be of any range (e.g. [0., 1.) or [0, 255]) and of interger or floating point dtype. By default, the layer will output floats.",
   :rdf/type :owl/Class,
   :rdfs/label "CenterCrop Layer",
   :rdfs/subClassOf :aio/Image_Preprocessing_Layer})

(def Classification
  {:db/ident :aio/Classification,
   :obo/IAO_0000115
   "Methods that distinguishand distribute kinds of \"things\" into different groups.",
   :rdf/type :owl/Class,
   :rdfs/label "Classification",
   :rdfs/subClassOf :aio/Supervised_Learning})

(def Clustering
  {:db/ident :aio/Clustering,
   :obo/IAO_0000115
   "Methods that group a set of objects in such a way that objects in the same group (called a cluster) are more similar (in some sense) to each other than to those in other groups (clusters).",
   :oboInOwl/hasExactSynonym "Cluster analysis",
   :rdf/type :owl/Class,
   :rdfs/label "Clustering",
   :rdfs/subClassOf :aio/Machine_Learning})

(def Cognitive_Bias
  {:db/ident :aio/Cognitive_Bias,
   :obo/IAO_0000115
   "A broad term referring generally to a systematic pattern of deviation from rational judgement and decision-making. A large variety of cognitive biases have been identified over many decades of research in judgement and decision-making, some of which are adaptive mental shortcuts known as heuristics.",
   :rdf/type :owl/Class,
   :rdfs/label "Cognitive Bias",
   :rdfs/subClassOf :aio/Individual_Bias})

(def Computational_Bias
  {:db/ident :aio/Computational_Bias,
   :obo/IAO_0000115
   "A systematic tendency which causes differences between results and facts. The bias exists in numbers of the process of data analysis, including the source of the data, the estimator chosen, and the ways the data was analyzed.",
   :oboInOwl/hasExactSynonym "Statistical Bias",
   :rdf/type :owl/Class,
   :rdfs/label "Computational Bias",
   :rdfs/subClassOf :aio/Bias})

(def Concatenate_Layer
  {:db/ident :aio/Concatenate_Layer,
   :obo/IAO_0000115
   "Layer that concatenates a list of inputs. It takes as input a list of tensors, all of the same shape except for the concatenation axis, and returns a single tensor that is the concatenation of all inputs.",
   :rdf/type :owl/Class,
   :rdfs/label "Concatenate Layer",
   :rdfs/subClassOf :aio/Merging_Layer})

(def Concept_Drift_Bias
  {:db/ident :aio/Concept_Drift_Bias,
   :obo/IAO_0000115
   "Use of a system outside the planned domain of application, and a common cause of performance gaps between laboratory settings and the real world.",
   :oboInOwl/hasExactSynonym "Concept Drift",
   :rdf/type :owl/Class,
   :rdfs/label "Concept Drift Bias",
   :rdfs/subClassOf :aio/Use_And_Interpretation_Bias})

(def Confirmation_Bias
  {:db/ident :aio/Confirmation_Bias,
   :obo/IAO_0000115
   "A cognitive bias where people tend to prefer information that aligns with, or confirms, their existing beliefs. People can exhibit confirmation bias in the search for, interpretation of, and recall of information. In the famous Wason selection task experiments, participants repeatedly showed a preference for confirmation over falsification. They were tasked with identifying an underlying rule that applied to number triples they were shown, and they overwhelmingly tested triples that confirmed rather than falsified their hypothesized rule.",
   :rdf/type :owl/Class,
   :rdfs/label "Confirmation Bias",
   :rdfs/subClassOf :aio/Individual_Bias})

(def Consumer_Bias
  {:db/ident :aio/Consumer_Bias,
   :obo/IAO_0000115
   "Arises when an algorithm or platform provides users with a new venue within which to express their biases, and may occur from either side, or party, in a digital interaction..",
   :rdf/type :owl/Class,
   :rdfs/label "Consumer Bias",
   :rdfs/subClassOf :aio/Individual_Bias})

(def Content_Production_Bias
  {:db/ident :aio/Content_Production_Bias,
   :obo/IAO_0000115
   "Arises from structural, lexical, semantic, and syntactic differences in the contents generated by users.",
   :rdf/type :owl/Class,
   :rdfs/label "Content Production Bias",
   :rdfs/subClassOf :aio/Use_And_Interpretation_Bias})

(def Continual_Learning
  {:db/ident :aio/Continual_Learning,
   :obo/IAO_0000115
   "A concept to learn a model for a large number of tasks sequentially without forgetting knowledge obtained from the preceding tasks, where the data in the old tasks are not available any more during training new ones.",
   :oboInOwl/hasExactSynonym #{"Incremental Learning" "Life-Long Learning"},
   :rdf/type :owl/Class,
   :rdfs/label "Continual Learning",
   :rdfs/subClassOf :aio/DNN})

(def Contrastive_Learning
  {:db/ident :aio/Contrastive_Learning,
   :obo/IAO_0000115
   "Learning that encourages augmentations (views) of the same input to have more similar representations compared to augmentations of different inputs.",
   :rdf/type :owl/Class,
   :rdfs/label "Contrastive Learning",
   :rdfs/subClassOf :aio/DNN})

(def ConvLSTM1D_Layer
  {:db/ident :aio/ConvLSTM1D_Layer,
   :obo/IAO_0000115
   "1D Convolutional LSTM. Similar to an LSTM layer, but the input transformations and recurrent transformations are both convolutional.",
   :rdf/type :owl/Class,
   :rdfs/label "ConvLSTM1D Layer",
   :rdfs/subClassOf :aio/Convolutional_Layer})

(def ConvLSTM2D_Layer
  {:db/ident :aio/ConvLSTM2D_Layer,
   :obo/IAO_0000115
   "2D Convolutional LSTM. Similar to an LSTM layer, but the input transformations and recurrent transformations are both convolutional.",
   :rdf/type :owl/Class,
   :rdfs/label "ConvLSTM2D Layer",
   :rdfs/subClassOf :aio/Convolutional_Layer})

(def ConvLSTM3D_Layer
  {:db/ident :aio/ConvLSTM3D_Layer,
   :obo/IAO_0000115
   "3D Convolutional LSTM. Similar to an LSTM layer, but the input transformations and recurrent transformations are both convolutional.",
   :rdf/type :owl/Class,
   :rdfs/label "ConvLSTM3D Layer",
   :rdfs/subClassOf :aio/Convolutional_Layer})

(def Convolution1DTranspose_Layer
  {:db/ident :aio/Convolution1DTranspose_Layer,
   :obo/IAO_0000115
   "Transposed convolution layer (sometimes called Deconvolution). The need for transposed convolutions generally arises from the desire to use a transformation going in the opposite direction of a normal convolution, i.e., from something that has the shape of the output of some convolution to something that has the shape of its input while maintaining a connectivity pattern that is compatible with said convolution. When using this layer as the first layer in a model, provide the keyword argument input_shape (tuple of integers or None, does not include the sample axis), e.g. input_shape=(128, 3) for data with 128 time steps and 3 channels.",
   :oboInOwl/hasExactSynonym #{"Conv1DTranspose Layer" "ConvTranspose1d"
                               "Convolution1dTranspose" "Convolution1DTranspose"
                               "nn.ConvTranspose1d"},
   :rdf/type :owl/Class,
   :rdfs/label "Convolution1DTranspose Layer",
   :rdfs/subClassOf :aio/Layer})

(def Convolution1D_Layer
  {:db/ident        :aio/Convolution1D_Layer,
   :obo/IAO_0000115 "1D convolution layer (e.g. temporal convolution).",
   :oboInOwl/hasExactSynonym #{"Conv1D Layer" "Convolution1D" "Conv1d"
                               "nn.Conv1d" "Convolution1d"},
   :rdf/type        :owl/Class,
   :rdfs/label      "Convolution1D Layer",
   :rdfs/subClassOf :aio/Layer})

(def Convolution2DTranspose_Layer
  {:db/ident :aio/Convolution2DTranspose_Layer,
   :obo/IAO_0000115
   "Transposed convolution layer (sometimes called Deconvolution).",
   :oboInOwl/hasExactSynonym #{"Convolution2DTranspose" "ConvTranspose2d"
                               "nn.ConvTranspose2d" "Convolution2dTranspose"
                               "Conv2DTranspose Layer"},
   :rdf/type :owl/Class,
   :rdfs/label "Convolution2DTranspose Layer",
   :rdfs/subClassOf :aio/Layer})

(def Convolution2D_Layer
  {:db/ident :aio/Convolution2D_Layer,
   :obo/IAO_0000115
   "2D convolution layer (e.g. spatial convolution over images). This layer creates a convolution kernel that is convolved with the layer input to produce a tensor of outputs. If use_bias is True, a bias vector is created and added to the outputs. Finally, if activation is not None, it is applied to the outputs as well. When using this layer as the first layer in a model, provide the keyword argument input_shape (tuple of integers or None, does not include the sample axis), e.g. input_shape=(128, 128, 3) for 128x128 RGB pictures in data_format=\"channels_last\". You can use None when a dimension has variable size.",
   :oboInOwl/hasExactSynonym #{"Convolution2d" "Conv2d" "Conv2D Layer"
                               "nn.Conv2d" "Convolution2D"},
   :rdf/type :owl/Class,
   :rdfs/label "Convolution2D Layer",
   :rdfs/subClassOf :aio/Layer})

(def Convolution3DTranspose_Layer
  {:db/ident :aio/Convolution3DTranspose_Layer,
   :obo/IAO_0000115
   "Transposed convolution layer (sometimes called Deconvolution). The need for transposed convolutions generally arises from the desire to use a transformation going in the opposite direction of a normal convolution, i.e., from something that has the shape of the output of some convolution to something that has the shape of its input while maintaining a connectivity pattern that is compatible with said convolution. When using this layer as the first layer in a model, provide the keyword argument input_shape (tuple of integers or None, does not include the sample axis), e.g. input_shape=(128, 128, 128, 3) for a 128x128x128 volume with 3 channels if data_format=\"channels_last\".",
   :oboInOwl/hasExactSynonym #{"Convolution3DTranspose" "ConvTranspose3d"
                               "nn.ConvTranspose3d" "Conv3DTranspose Layer"
                               "Convolution3dTranspose"},
   :rdf/type :owl/Class,
   :rdfs/label "Convolution3DTranspose Layer",
   :rdfs/subClassOf :aio/Layer})

(def Convolution3D_Layer
  {:db/ident :aio/Convolution3D_Layer,
   :obo/IAO_0000115
   "3D convolution layer (e.g. spatial convolution over volumes). This layer creates a convolution kernel that is convolved with the layer input to produce a tensor of outputs. If use_bias is True, a bias vector is created and added to the outputs. Finally, if activation is not None, it is applied to the outputs as well. When using this layer as the first layer in a model, provide the keyword argument input_shape (tuple of integers or None, does not include the sample axis), e.g. input_shape=(128, 128, 128, 1) for 128x128x128 volumes with a single channel, in data_format=\"channels_last\".",
   :oboInOwl/hasExactSynonym #{"Conv3D Layer" "Convolution3d" "Conv3d"
                               "Convolution3D" "nn.Conv3d"},
   :rdf/type :owl/Class,
   :rdfs/label "Convolution3D Layer",
   :rdfs/subClassOf :aio/Layer})

(def Convolutional_Layer
  {:db/ident :aio/Convolutional_Layer,
   :obo/IAO_0000115
   "A convolutional layer is the main building block of a CNN. It contains a set of filters (or kernels), parameters of which are to be learned throughout the training. The size of the filters is usually smaller than the actual image. Each filter convolves with the image and creates an activation map.",
   :rdf/type :owl/Class,
   :rdfs/label "Convolutional Layer",
   :rdfs/subClassOf :aio/Layer})

(def Cropping1D_Layer
  {:db/ident :aio/Cropping1D_Layer,
   :obo/IAO_0000115
   "Cropping layer for 1D input (e.g. temporal sequence). It crops along the time dimension (axis 1).",
   :rdf/type :owl/Class,
   :rdfs/label "Cropping1D Layer",
   :rdfs/subClassOf :aio/Reshaping_Layer})

(def Cropping2D_Layer
  {:db/ident :aio/Cropping2D_Layer,
   :obo/IAO_0000115
   "Cropping layer for 2D input (e.g. picture). It crops along spatial dimensions, i.e. height and width.",
   :rdf/type :owl/Class,
   :rdfs/label "Cropping2D Layer",
   :rdfs/subClassOf :aio/Layer})

(def Cropping3D_Layer
  {:db/ident :aio/Cropping3D_Layer,
   :obo/IAO_0000115
   "Cropping layer for 3D data (e.g. spatial or spatio-temporal).",
   :rdf/type :owl/Class,
   :rdfs/label "Cropping3D Layer",
   :rdfs/subClassOf :aio/Layer})

(def DFF
  {:db/ident :aio/DFF,
   :rdf/type :owl/Class})

(def DNN
  {:db/ident :aio/DNN,
   :rdf/type :owl/Class})

(def Data_Dredging_Bias
  {:db/ident :aio/Data_Dredging_Bias,
   :obo/IAO_0000115
   "A statistical bias in which testing huge numbers of hypotheses of a dataset may appear to yield statistical significance even when the results are statistically nonsignificant.",
   :oboInOwl/hasExactSynonym "Data Dredging",
   :rdf/type :owl/Class,
   :rdfs/label "Data Dredging Bias",
   :rdfs/subClassOf :aio/Use_And_Interpretation_Bias})

(def Data_Generation_Bias
  {:db/ident :aio/Data_Generation_Bias,
   :obo/IAO_0000115
   "Arises from the addition of synthetic or redundant data samples to a dataset.",
   :rdf/type :owl/Class,
   :rdfs/label "Data Generation Bias",
   :rdfs/subClassOf :aio/Selection_And_Sampling_Bias})

(def Data_Imputation
  {:db/ident :aio/Data_Imputation,
   :obo/IAO_0000115
   "Methods that replace missing data with substituted values.",
   :rdf/type :owl/Class,
   :rdfs/label "Data Imputation",
   :rdfs/subClassOf :aio/Machine_Learning})

(def Decision_Tree
  {:db/ident :aio/Decision_Tree,
   :obo/IAO_0000115
   "A decision support tool that uses a tree-like model of decisions and their possible consequences, including chance event outcomes, resource costs, and utility.",
   :rdf/type :owl/Class,
   :rdfs/label "Decision Tree",
   :rdfs/subClassOf :aio/Classification})

(def Decoder_LLM
  {:db/ident :aio/Decoder_LLM,
   :obo/IAO_0000115
   "In the decoder-only architecture, the model consists of only a decoder, which is trained to predict the next token in a sequence given the previous tokens. The critical difference between the Decoder-only architecture and the Encoder-Decoder architecture is that the Decoder-only architecture does not have an explicit encoder to summarize the input information. Instead, the information is encoded implicitly in the hidden state of the decoder, which is updated at each step of the generation process.",
   :oboInOwl/hasExactSynonym "LLM",
   :rdf/type :owl/Class,
   :rdfs/label "Decoder LLM",
   :rdfs/subClassOf :aio/LLM})

(def Deconvolutional_Network
  {:db/ident :aio/Deconvolutional_Network,
   :obo/IAO_0000115
   "Deconvolutional Networks, a framework that permits the unsupervised construction of hierarchical image representations. These representations can be used for both low-level tasks such as denoising, as well as providing features for object recognition. Each level of the hierarchy groups information from the level beneath to form more complex features that exist over a larger scale in the image. (https://ieeexplore.ieee.org/document/5539957)",
   :oboInOwl/hasExactSynonym "DN",
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Kernel, Convolutional/Pool, Output",
   :rdfs/label "Deconvolutional Network",
   :rdfs/subClassOf :aio/DNN})

(def Deep_Active_Learning
  {:db/ident :aio/Deep_Active_Learning,
   :obo/IAO_0000115
   "The combination of deep learning and active learning, where active learning attempts to maximize a model’s performance gain while annotating the fewest samples possible.",
   :oboInOwl/hasExactSynonym "DeepAL",
   :rdf/type :owl/Class,
   :rdfs/label "Deep Active Learning",
   :rdfs/subClassOf :aio/DNN})

(def Deep_Belief_Network
  {:db/ident :aio/Deep_Belief_Network,
   :obo/IAO_0000115
   "In machine Learning, a deep belief network (DBN) is a generative graphical model, or alternatively a class of deep neural network, composed of multiple layers of latent variables (\"hidden units\"), with connections between the layers but not between units within each layer. When trained on a set of examples without supervision, a DBN can learn to probabilistically reconstruct its inputs. The layers then act as feature detectors. After this Learning step, a DBN can be further trained with supervision to perform classification. DBNs can be viewed as a composition of simple, unsupervised networks such as restricted Boltzmann machines (RBMs) or autoencoders, where each sub-network's hidden layer serves as the visible layer for the next. An RBM is an undirected, generative energy-based model with a \"visible\" input layer and a hidden layer and connections between but not within layers. This composition leads to a fast, layer-by-layer unsupervised training procedure, where contrastive divergence is applied to each sub-network in turn, starting from the \"lowest\" pair of layers (the lowest visible layer is a training set). The observation that DBNs can be trained greedily, one layer at a time, led to one of the first effective deep Learning algorithms. (https://en.wikipedia.org/wiki/Deep_belief_network)",
   :oboInOwl/hasExactSynonym "DBN",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Backfed Input, Probabilistic Hidden, Hidden, Matched Output-Input",
   :rdfs/label "Deep Belief Network",
   :rdfs/subClassOf :aio/UPN})

(def Deep_Convolutional_Inverse_Graphics_Network
  {:db/ident :aio/Deep_Convolutional_Inverse_Graphics_Network,
   :obo/IAO_0000115
   "A Deep Convolution Inverse Graphics Network (DC-IGN) is a model that learns an interpretable representation of images. This representation is disentangled with respect to transformations such as out-of-plane rotations and lighting variations. The DC-IGN model is composed of multiple layers of convolution and de-convolution operators and is trained using the Stochastic Gradient Variational Bayes (SGVB) algorithm. (https://arxiv.org/abs/1503.03167)",
   :oboInOwl/hasExactSynonym "DCIGN",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Input, Kernel, Convolutional/Pool, Probabilistic Hidden, Convolutional/Pool, Kernel, Output",
   :rdfs/label "Deep Convolutional Inverse Graphics Network",
   :rdfs/subClassOf :aio/AE})

(def Deep_Convolutional_Network
  {:db/ident :aio/Deep_Convolutional_Network,
   :obo/IAO_0000115
   "A convolutional neural network (CNN, or ConvNet) is a class of artificial neural network, most commonly applied to analyze visual imagery. They are also known as shift invariant or space invariant artificial neural networks (SIANN), based on the shared-weight architecture of the convolution kernels or filters that slide along input features and provide translation equivariant responses known as feature maps. CNNs are regularized versions of multilayer perceptrons. (https://en.wikipedia.org/wiki/Convolutional_neural_network)",
   :oboInOwl/hasExactSynonym #{"Convolutional Neural Network" "CNN" "ConvNet"
                               "DCN"},
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Kernel, Convolutional/Pool, Hidden, Output",
   :rdfs/label "Deep Convolutional Network",
   :rdfs/subClassOf :aio/DNN})

(def Deep_FeedFoward
  {:db/ident :aio/Deep_FeedFoward,
   :obo/IAO_0000115
   "The feedforward neural network was the first and simplest type of artificial neural network devised. In this network, the information moves in only one direction—forward—from the input nodes, through the hidden nodes (if any) and to the output nodes. There are no cycles or loops in the network.",
   :oboInOwl/hasExactSynonym #{"Multilayer Perceptoron" "DFF"
                               "Feedforward Network" "MLP" "FFN"},
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Hidden, Output",
   :rdfs/label "Deep FeedFoward",
   :rdfs/subClassOf :aio/DNN})

(def Deep_Neural_Network
  {:db/ident :aio/Deep_Neural_Network,
   :obo/IAO_0000115
   "A deep neural network (DNN) is an artificial neural network (ANN) with multiple layers between the input and output layers.[13][2] There are different types of neural networks but they always consist of the same components: neurons, synapses, weights, biases, and functions. (https://en.wikipedia.org/wiki/Deep_Learning#:~:text=A%20deep%20neural%20network%20(DNN,weights%2C%20biases%2C%20and%20functions.)",
   :oboInOwl/hasExactSynonym "DNN",
   :rdf/type :owl/Class,
   :rdfs/label "Deep Neural Network",
   :rdfs/subClassOf :aio/ANN})

(def Deep_Transfer_Learning
  {:db/ident :aio/Deep_Transfer_Learning,
   :obo/IAO_0000115
   "Deep transfer learning methods relax the hypothesis that the training data must be independent and identically distributed (i.i.d.) with the test data, which motivates us to use transfer learning to solve the problem of insufficient training data.",
   :rdf/type :owl/Class,
   :rdfs/label "Deep Transfer Learning",
   :rdfs/subClassOf :aio/DNN})

(def Denoising_Auto_Encoder
  {:db/ident :aio/Denoising_Auto_Encoder,
   :obo/IAO_0000115
   "Denoising Auto Encoders (DAEs) take a partially corrupted input and are trained to recover the original undistorted input. In practice, the objective of denoising autoencoders is that of cleaning the corrupted input, or denoising. (https://en.wikipedia.org/wiki/Autoencoder)",
   :oboInOwl/hasExactSynonym "DAE",
   :rdf/type :owl/Class,
   :rdfs/comment "Noisy Input, Hidden, Matched Output-Input",
   :rdfs/label "Denoising Auto Encoder",
   :rdfs/subClassOf :aio/AE})

(def DenseFeatures_Layer
  {:db/ident :aio/DenseFeatures_Layer,
   :obo/IAO_0000115
   "A layer that produces a dense Tensor based on given feature_columns. Generally a single example in training data is described with FeatureColumns. At the first layer of the model, this column oriented data should be converted to a single Tensor. This layer can be called multiple times with different features. This is the V2 version of this layer that uses name_scopes to create variables instead of variable_scopes. But this approach currently lacks support for partitioned variables. In that case, use the V1 version instead.",
   :rdf/type :owl/Class,
   :rdfs/label "DenseFeatures Layer",
   :rdfs/subClassOf :aio/Layer})

(def Dense_Layer
  {:db/ident        :aio/Dense_Layer,
   :obo/IAO_0000115 "Just your regular densely-connected NN layer.",
   :rdf/type        :owl/Class,
   :rdfs/label      "Dense Layer",
   :rdfs/subClassOf :aio/Layer})

(def Deployment_Bias
  {:db/ident :aio/Deployment_Bias,
   :obo/IAO_0000115
   "Arises when systems are used as decision aids for humans, since the human intermediary may act on predictions in ways that are typically not modeled in the system. However, it is still individuals using the deployed system.",
   :rdf/type :owl/Class,
   :rdfs/label "Deployment Bias",
   :rdfs/subClassOf :aio/Group_Bias})

(def DepthwiseConv1D_Layer
  {:db/ident :aio/DepthwiseConv1D_Layer,
   :obo/IAO_0000115
   "Depthwise 1D convolution. Depthwise convolution is a type of convolution in which each input channel is convolved with a different kernel (called a depthwise kernel). You can understand depthwise convolution as the first step in a depthwise separable convolution. It is implemented via the following steps: Split the input into individual channels. Convolve each channel with an individual depthwise kernel with depth_multiplier output channels. Concatenate the convolved outputs along the channels axis. Unlike a regular 1D convolution, depthwise convolution does not mix information across different input channels. The depth_multiplier argument determines how many filter are applied to one input channel. As such, it controls the amount of output channels that are generated per input channel in the depthwise step.",
   :rdf/type :owl/Class,
   :rdfs/label "DepthwiseConv1D Layer",
   :rdfs/subClassOf :aio/Convolutional_Layer})

(def DepthwiseConv2D_Layer
  {:db/ident        :aio/DepthwiseConv2D_Layer,
   :obo/IAO_0000115 "Depthwise 2D convolution.",
   :rdf/type        :owl/Class,
   :rdfs/label      "DepthwiseConv2D Layer",
   :rdfs/subClassOf :aio/Convolutional_Layer})

(def Detection_Bias
  {:db/ident :aio/Detection_Bias,
   :obo/IAO_0000115
   "Systematic differences between groups in how outcomes are determined and may cause an over- or underestimation of the size of the effect.",
   :rdf/type :owl/Class,
   :rdfs/label "Detection Bias",
   :rdfs/subClassOf :aio/Selection_And_Sampling_Bias})

(def Dimensionality_Reduction
  {:db/ident :aio/Dimensionality_Reduction,
   :obo/IAO_0000115
   "The transformation of data from a high-dimensional space into a low-dimensional space so that the low-dimensional representation retains some meaningful properties of the original data, ideally close to its intrinsic dimension.",
   :oboInOwl/hasExactSynonym "Dimension Reduction",
   :rdf/type :owl/Class,
   :rdfs/label "Dimensionality Reduction",
   :rdfs/subClassOf :aio/Unsupervised_Learning})

(def Discretization_Layer
  {:db/ident :aio/Discretization_Layer,
   :obo/IAO_0000115
   "A preprocessing layer which buckets continuous features by ranges.",
   :rdf/type :owl/Class,
   :rdfs/label "Discretization Layer",
   :rdfs/subClassOf :aio/Numerical_Features_Preprocessing_Layer})

(def Dot_Layer
  {:db/ident :aio/Dot_Layer,
   :obo/IAO_0000115
   "Layer that computes a dot product between samples in two tensors. E.g. if applied to a list of two tensors a and b of shape (batch_size, n), the output will be a tensor of shape (batch_size, 1) where each entry i will be the dot product between a[i] and b[i].",
   :rdf/type :owl/Class,
   :rdfs/label "Dot Layer",
   :rdfs/subClassOf :aio/Layer})

(def Dropout_Layer
  {:db/ident :aio/Dropout_Layer,
   :obo/IAO_0000115
   "Applies Dropout to the input. The Dropout layer randomly sets input units to 0 with a frequency of rate at each step during training time, which helps prevent overfitting. Inputs not set to 0 are scaled up by 1/(1 - rate) such that the sum over all inputs is unchanged. Note that the Dropout layer only applies when training is set to True such that no values are dropped during inference. When using model.fit, training will be appropriately set to True automatically, and in other contexts, you can set the kwarg explicitly to True when calling the layer. (This is in contrast to setting trainable=False for a Dropout layer. trainable does not affect the layer's behavior, as Dropout does not have any variables/weights that can be frozen during training.)",
   :rdf/type :owl/Class,
   :rdfs/label "Dropout Layer",
   :rdfs/subClassOf :aio/Regularization_Layer})

(def Dunning-Kruger_Effect_Bias
  {:db/ident :aio/Dunning-Kruger_Effect_Bias,
   :obo/IAO_0000115
   "The tendency of people with low ability in a given area or task to overestimate their self-assessed ability. Typically measured by comparing self-assessment with objective performance, often called subjective ability and objective ability, respectively.",
   :oboInOwl/hasExactSynonym "Dunning-Kruger Effect",
   :rdf/type :owl/Class,
   :rdfs/label "Dunning-Kruger Effect Bias",
   :rdfs/subClassOf :aio/Cognitive_Bias})

(def ELU_Layer
  {:db/ident        :aio/ELU_Layer,
   :obo/IAO_0000115 "Exponential Linear Unit.",
   :rdf/type        :owl/Class,
   :rdfs/label      "ELU Layer",
   :rdfs/subClassOf :aio/Activation_Layer})

(def Echo_State_Network
  {:db/ident :aio/Echo_State_Network,
   :obo/IAO_0000115
   "The echo state network (ESN) is a type of reservoir computer that uses a recurrent neural network with a sparsely connected hidden layer (with typically 1% connectivity). The connectivity and weights of hidden neurons are fixed and randomly assigned. The weights of output neurons can be learned so that the network can produce or reproduce specific temporal patterns. The main interest of this network is that although its behaviour is non-linear, the only weights that are modified during training are for the synapses that connect the hidden neurons to output neurons. Thus, the error function is quadratic with respect to the parameter vector and can be differentiated easily to a linear system.",
   :oboInOwl/hasExactSynonym "ESN",
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Recurrent, Output",
   :rdfs/label "Echo State Network",
   :rdfs/subClassOf :aio/RecNN})

(def Ecological_Fallacy_Bias
  {:db/ident :aio/Ecological_Fallacy_Bias,
   :obo/IAO_0000115
   "Occurs when an inference is made about an individual based on their membership within a group.",
   :oboInOwl/hasExactSynonym "Ecological Fallacy",
   :rdf/type :owl/Class,
   :rdfs/label "Ecological Fallacy Bias",
   :rdfs/subClassOf :aio/Selection_And_Sampling_Bias})

(def Embedding_Layer
  {:db/ident :aio/Embedding_Layer,
   :obo/IAO_0000115
   "Turns positive integers (indexes) into dense vectors of fixed size.",
   :rdf/type :owl/Class,
   :rdfs/label "Embedding Layer",
   :rdfs/subClassOf :aio/Layer})

(def Emergent_Bias
  {:db/ident :aio/Emergent_Bias,
   :obo/IAO_0000115
   "Emergent bias is the result of the use and reliance on algorithms across new or unanticipated contexts.",
   :rdf/type :owl/Class,
   :rdfs/label "Emergent Bias",
   :rdfs/subClassOf :aio/Use_And_Interpretation_Bias})

(def Encoder-Decoder_LLM
  {:db/ident :aio/Encoder-Decoder_LLM,
   :obo/IAO_0000115
   "The Encoder-Decoder architecture was the original transformer architecture introduced in the Attention Is All You Need (https://arxiv.org/abs/1706.03762) paper. The encoder processes the input sequence and generates a hidden representation that summarizes the input information. The decoder uses this hidden representation to generate the desired output sequence. The encoder and decoder are trained end-to-end to maximize the likelihood of the correct output sequence given the input sequence.",
   :oboInOwl/hasExactSynonym "LLM",
   :rdf/type :owl/Class,
   :rdfs/label "Encoder-Decoder LLM",
   :rdfs/subClassOf :aio/LLM})

(def Encoder_LLM
  {:db/ident :aio/Encoder_LLM,
   :obo/IAO_0000115
   "The Encoder-only architecture is used when only encoding the input sequence is required and the decoder is not necessary. The input sequence is encoded into a fixed-length representation and then used as input to a classifier or a regressor to make a prediction. These models have a pre-trained general-purpose encoder but will require fine-tuning of the final classifier or regressor.",
   :oboInOwl/hasExactSynonym "LLM",
   :rdf/type :owl/Class,
   :rdfs/label "Encoder LLM",
   :rdfs/subClassOf :aio/LLM})

(def Ensemble_Learning
  {:db/ident :aio/Ensemble_Learning,
   :obo/IAO_0000115
   "Ensemble methods use multiple learning algorithms to obtain better predictive performance than could be obtained from any of the constituent learning algorithms alone.",
   :rdf/type :owl/Class,
   :rdfs/label "Ensemble Learning",
   :rdfs/subClassOf :aio/Machine_Learning})

(def Error_Propagation_Bias
  {:db/ident :aio/Error_Propagation_Bias,
   :obo/IAO_0000115
   "The effect of variables' uncertainties (or errors, more specifically random errors) on the uncertainty of a function based on them.",
   :oboInOwl/hasExactSynonym "Error Propagation",
   :rdf/type :owl/Class,
   :rdfs/label "Error Propagation Bias",
   :rdfs/subClassOf :aio/Processing_Bias})

(def Evaluation_Bias
  {:db/ident :aio/Evaluation_Bias,
   :obo/IAO_0000115
   "Arises when the testing or external benchmark populations do not equally represent the various parts of the user population or from the use of performance metrics that are not appropriate for the way in which the model will be used.",
   :rdf/type :owl/Class,
   :rdfs/label "Evaluation Bias",
   :rdfs/subClassOf :aio/Selection_And_Sampling_Bias})

(def Exclusion_Bias
  {:db/ident :aio/Exclusion_Bias,
   :obo/IAO_0000115
   "When specific groups of user populations are excluded from testing and subsequent analyses.",
   :rdf/type :owl/Class,
   :rdfs/label "Exclusion Bias",
   :rdfs/subClassOf :aio/Selection_And_Sampling_Bias})

(def Exponential_Function
  {:db/ident :aio/Exponential_Function,
   :obo/IAO_0000115
   "The exponential function is a mathematical function denoted by f(x)=exp or e^{x}.",
   :rdf/type :owl/Class,
   :rdfs/label "Exponential Function",
   :rdfs/subClassOf :aio/Function})

(def Extreme_Learning_Machine
  {:db/ident :aio/Extreme_Learning_Machine,
   :obo/IAO_0000115
   "Extreme Learning machines are feedforward neural networks for classification, regression, clustering, sparse approximation, compression and feature Learning with a single layer or multiple layers of hidden nodes, where the parameters of hidden nodes (not just the weights connecting inputs to hidden nodes) need not be tuned. These hidden nodes can be randomly assigned and never updated (i.e. they are random projection but with nonlinear transforms), or can be inherited from their ancestors without being changed. In most cases, the output weights of hidden nodes are usually learned in a single step, which essentially amounts to Learning a linear model. (https://en.wikipedia.org/wiki/Extreme_Learning_machine)",
   :oboInOwl/hasExactSynonym "ELM",
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Hidden, Output",
   :rdfs/label "Extreme Learning Machine",
   :rdfs/subClassOf :aio/FBN})

(def FBN
  {:db/ident :aio/FBN,
   :rdf/type :owl/Class})

(def Federated_Learning
  {:db/ident :aio/Federated_Learning,
   :obo/IAO_0000115
   "A technique that trains an algorithm across multiple decentralized edge devices or servers holding local data samples, without exchanging them.",
   :rdf/type :owl/Class,
   :rdfs/label "Federated Learning",
   :rdfs/subClassOf :aio/DNN})

(def Feedback_Loop_Bias
  {:db/ident :aio/Feedback_Loop_Bias,
   :obo/IAO_0000115
   "Effects that may occur when an algorithm learns from user behavior and feeds that behavior back into the model.",
   :rdf/type :owl/Class,
   :rdfs/label "Feedback Loop Bias",
   :rdfs/subClassOf :aio/Use_And_Interpretation_Bias})

(def Feedback_Network
  {:db/ident :aio/Feedback_Network,
   :obo/IAO_0000115
   "A feedback based approach in which the representation is formed in an iterative manner based on a feedback received from previous iteration's output. (https://arxiv.org/abs/1612.09508)",
   :oboInOwl/hasExactSynonym "FBN",
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Hidden, Output, Hidden",
   :rdfs/label "Feedback Network",
   :rdfs/subClassOf :aio/ANN})

(def Fixed_Effects_Model
  {:db/ident :aio/Fixed_Effects_Model,
   :obo/IAO_0000115
   "A statistical model in which the model parameters are fixed or non-random quantities.",
   :oboInOwl/hasExactSynonym "FEM",
   :rdf/type :owl/Class,
   :rdfs/label "Fixed Effects Model",
   :rdfs/subClassOf :aio/Regression_Analysis})

(def Flatten_Layer
  {:db/ident        :aio/Flatten_Layer,
   :obo/IAO_0000115 "Flattens the input. Does not affect the batch size.",
   :rdf/type        :owl/Class,
   :rdfs/label      "Flatten Layer",
   :rdfs/subClassOf :aio/Reshaping_Layer})

(def FractionalMaxPool2D_Layer
  {:db/ident :aio/FractionalMaxPool2D_Layer,
   :obo/IAO_0000115
   "Applies a 2D fractional max pooling over an input signal composed of several input planes.",
   :oboInOwl/hasExactSynonym #{"FractionalMaxPool2d" "FractionalMaxPool2D"},
   :rdf/type :owl/Class,
   :rdfs/label "FractionalMaxPool2D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def FractionalMaxPool3D_Layer
  {:db/ident :aio/FractionalMaxPool3D_Layer,
   :obo/IAO_0000115
   "Applies a 3D fractional max pooling over an input signal composed of several input planes.",
   :oboInOwl/hasExactSynonym #{"FractionalMaxPool3D" "FractionalMaxPool3d"},
   :rdf/type :owl/Class,
   :rdfs/label "FractionalMaxPool3D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def Function
  {:db/ident :aio/Function,
   :rdf/type :owl/Class})

(def Funding_Bias
  {:db/ident :aio/Funding_Bias,
   :obo/IAO_0000115
   "Arises when biased results are reported in order to support or satisfy the funding agency or financial supporter of the research study, but it can also be the individual researcher.",
   :rdf/type :owl/Class,
   :rdfs/label "Funding Bias",
   :rdfs/subClassOf :aio/Group_Bias})

(def GCN
  {:db/ident :aio/GCN,
   :rdf/type :owl/Class})

(def GRUCell_Layer
  {:db/ident :aio/GRUCell_Layer,
   :obo/IAO_0000115
   "Cell class for the GRU layer. This class processes one step within the whole time sequence input, whereas tf.keras.layer.GRU processes the whole sequence.",
   :rdf/type :owl/Class,
   :rdfs/label "GRUCell Layer",
   :rdfs/subClassOf :aio/Layer})

(def GRU_Layer
  {:db/ident :aio/GRU_Layer,
   :obo/IAO_0000115
   "Gated Recurrent Unit - Cho et al. 2014. Based on available runtime hardware and constraints, this layer will choose different implementations (cuDNN-based or pure-TensorFlow) to maximize the performance. If a GPU is available and all the arguments to the layer meet the requirement of the cuDNN kernel (see below for details), the layer will use a fast cuDNN implementation. The requirements to use the cuDNN implementation are: activation == tanh, recurrent_activation == sigmoid, recurrent_dropout == 0, unroll is False, use_bias is True, reset_after is True. Inputs, if use masking, are strictly right-padded. Eager execution is enabled in the outermost context. There are two variants of the GRU implementation. The default one is based on v3 and has reset gate applied to hidden state before matrix multiplication. The other one is based on original and has the order reversed. The second variant is compatible with CuDNNGRU (GPU-only) and allows inference on CPU. Thus it has separate biases for kernel and recurrent_kernel. To use this variant, set reset_after=True and recurrent_activation='sigmoid'.",
   :rdf/type :owl/Class,
   :rdfs/label "GRU Layer",
   :rdfs/subClassOf :aio/Recurrent_Layer})

(def Gated_Recurrent_Unit
  {:db/ident :aio/Gated_Recurrent_Unit,
   :obo/IAO_0000115
   "Gated recurrent units (GRUs) are a gating mechanism in recurrent neural networks, introduced in 2014 by Kyunghyun Cho et al. The GRU is like a long short-term memory (LSTM) with a forget gate, but has fewer parameters than LSTM, as it lacks an output gate. GRU's performance on certain tasks of polyphonic music modeling, speech signal modeling and natural language processing was found to be similar to that of LSTM.[4][5] GRUs have been shown to exhibit better performance on certain smaller and less frequent datasets.",
   :oboInOwl/hasExactSynonym "GRU",
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Memory Cell, Output",
   :rdfs/label "Gated Recurrent Unit",
   :rdfs/subClassOf :aio/LSTM})

(def GaussianDropout_Layer
  {:db/ident :aio/GaussianDropout_Layer,
   :obo/IAO_0000115
   "Apply multiplicative 1-centered Gaussian noise. As it is a regularization layer, it is only active at training time.",
   :rdf/type :owl/Class,
   :rdfs/label "GaussianDropout Layer",
   :rdfs/subClassOf :aio/Regularization_Layer})

(def GaussianNoise_Layer
  {:db/ident :aio/GaussianNoise_Layer,
   :obo/IAO_0000115
   "Apply additive zero-centered Gaussian noise. This is useful to mitigate overfitting (you could see it as a form of random data augmentation). Gaussian Noise (GS) is a natural choice as corruption process for real valued inputs. As it is a regularization layer, it is only active at training time.",
   :rdf/type :owl/Class,
   :rdfs/label "GaussianNoise Layer",
   :rdfs/subClassOf :aio/Regularization_Layer})

(def GeLu_Function
  {:db/ident :aio/GeLu_Function,
   :obo/IAO_0000115
   "Gaussian error linear unit (GELU) computes x * P(X <= x), where P(X) ~ N(0, 1). The (GELU) nonlinearity weights inputs by their value, rather than gates inputs by their sign as in ReLU.",
   :oboInOwl/hasExactSynonym #{"Gaussian Error Linear Unit" "GELU"},
   :rdf/type :owl/Class,
   :rdfs/label "GELU Function",
   :rdfs/subClassOf :aio/Function})

(def Generalized_Few-shot_Learning
  {:db/ident :aio/Generalized_Few-shot_Learning,
   :obo/IAO_0000115
   "Methods that can learn novel classes from only few samples per class, preventing catastrophic forgetting of base classes, and classifier calibration across novel and base classes.",
   :oboInOwl/hasExactSynonym "GFSL",
   :rdf/type :owl/Class,
   :rdfs/label "Generalized Few-shot Learning",
   :rdfs/subClassOf :aio/DNN})

(def Generalized_Linear_Model
  {:db/ident :aio/Generalized_Linear_Model,
   :obo/IAO_0000115
   "This model generalizes linear regression by allowing the linear model to be related to the response variable via a link function and by allowing the magnitude of the variance of each measurement to be a function of its predicted value.",
   :oboInOwl/hasExactSynonym "GLM",
   :rdf/type :owl/Class,
   :rdfs/label "Generalized Linear Model",
   :rdfs/subClassOf :aio/Regression_Analysis})

(def Generative_Adversarial_Network
  {:db/ident :aio/Generative_Adversarial_Network,
   :obo/IAO_0000115
   "A generative adversarial network (GAN) is a class of machine Learning frameworks designed by Ian Goodfellow and his colleagues in 2014. Two neural networks contest with each other in a game (in the form of a zero-sum game, where one agent's gain is another agent's loss). Given a training set, this technique learns to generate new data with the same statistics as the training set. For example, a GAN trained on photographs can generate new photographs that look at least superficially authentic to human observers, having many realistic characteristics. Though originally proposed as a form of generative model for unsupervised Learning, GANs have also proven useful for semi-supervised Learning, fully supervised Learning,[ and reinforcement Learning. The core idea of a GAN is based on the \"indirect\" training through the discriminator,[clarification needed] which itself is also being updated dynamically. This basically means that the generator is not trained to minimize the distance to a specific image, but rather to fool the discriminator. This enables the model to learn in an unsupervised manner.",
   :oboInOwl/hasExactSynonym "GAN",
   :rdf/type :owl/Class,
   :rdfs/comment
   "Backfed Input, Hidden, Matched Output-Input, Hidden, Matched Output-Input",
   :rdfs/label "Generative Adversarial Network",
   :rdfs/subClassOf :aio/UPN})

(def GlobalAveragePooling1D_Layer
  {:db/ident        :aio/GlobalAveragePooling1D_Layer,
   :obo/IAO_0000115 "Global average pooling operation for temporal data.",
   :oboInOwl/hasExactSynonym #{"GlobalAvgPool1D" "GlobalAvgPool1d"},
   :rdf/type        :owl/Class,
   :rdfs/label      "GlobalAveragePooling1D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def GlobalAveragePooling2D_Layer
  {:db/ident        :aio/GlobalAveragePooling2D_Layer,
   :obo/IAO_0000115 "Global average pooling operation for spatial data.",
   :oboInOwl/hasExactSynonym #{"GlobalAvgPool2d" "GlobalAvgPool2D"},
   :rdf/type        :owl/Class,
   :rdfs/label      "GlobalAveragePooling2D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def GlobalAveragePooling3D_Layer
  {:db/ident        :aio/GlobalAveragePooling3D_Layer,
   :obo/IAO_0000115 "Global Average pooling operation for 3D data.",
   :oboInOwl/hasExactSynonym #{"GlobalAvgPool3d" "GlobalAvgPool3D"},
   :rdf/type        :owl/Class,
   :rdfs/label      "GlobalAveragePooling3D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def GlobalMaxPooling1D_Layer
  {:db/ident        :aio/GlobalMaxPooling1D_Layer,
   :obo/IAO_0000115 "Global max pooling operation for 1D temporal data.",
   :oboInOwl/hasExactSynonym #{"GlobalMaxPool1d" "GlobalMaxPool1D"},
   :rdf/type        :owl/Class,
   :rdfs/label      "GlobalMaxPooling1D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def GlobalMaxPooling2D_Layer
  {:db/ident        :aio/GlobalMaxPooling2D_Layer,
   :obo/IAO_0000115 "Global max pooling operation for spatial data.",
   :oboInOwl/hasExactSynonym #{"GlobalMaxPool2D" "GlobalMaxPool2d"},
   :rdf/type        :owl/Class,
   :rdfs/label      "GlobalMaxPooling2D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def GlobalMaxPooling3D_Layer
  {:db/ident        :aio/GlobalMaxPooling3D_Layer,
   :obo/IAO_0000115 "Global Max pooling operation for 3D data.",
   :oboInOwl/hasExactSynonym #{"GlobalMaxPool3d" "GlobalMaxPool3D"},
   :rdf/type        :owl/Class,
   :rdfs/label      "GlobalMaxPooling3D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def Graph_Convolutional_Network
  {:db/ident :aio/Graph_Convolutional_Network,
   :obo/IAO_0000115
   "GCN is a type of convolutional neural network that can work directly on graphs and take advantage of their structural information. (https://arxiv.org/abs/1609.02907)",
   :oboInOwl/hasExactSynonym "GCN",
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Hidden, Hidden, Output",
   :rdfs/label "Graph Convolutional Network",
   :rdfs/subClassOf :aio/DNN})

(def Graph_Convolutional_Policy_Network
  {:db/ident :aio/Graph_Convolutional_Policy_Network,
   :obo/IAO_0000115
   "Graph Convolutional Policy Network (GCPN), a general graph convolutional network based model for goal-directed graph generation through reinforcement Learning. The model is trained to optimize domain-specific rewards and adversarial loss through policy gradient, and acts in an environment that incorporates domain-specific rules.",
   :oboInOwl/hasExactSynonym "GPCN",
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Hidden, Hidden, Policy, Output",
   :rdfs/label "Graph Convolutional Policy Network",
   :rdfs/subClassOf :aio/GCN})

(def GroupNorm_Layer
  {:db/ident :aio/GroupNorm_Layer,
   :obo/IAO_0000115
   "Applies Group Normalization over a mini-batch of inputs as described in the paper Group Normalization",
   :oboInOwl/hasExactSynonym #{"nn.GroupNorm" "GroupNorm"},
   :rdf/type :owl/Class,
   :rdfs/label "GroupNorm Layer",
   :rdfs/subClassOf :aio/Normalization_Layer})

(def Group_Bias
  {:db/ident :aio/Group_Bias,
   :obo/IAO_0000115
   "A pattern of favoring members of one's in-group over out-group members. This can be expressed in evaluation of others, in allocation of resources, and in many other ways.",
   :oboInOwl/hasExactSynonym #{"Intergroup bias" "In-group Favoritism"
                               "In-group preference" "In-group bias"
                               "In-group–out-group Bias"},
   :rdf/type :owl/Class,
   :rdfs/label "Group Bias",
   :rdfs/subClassOf :aio/Human_Bias})

(def Groupthink_Bias
  {:db/ident :aio/Groupthink_Bias,
   :obo/IAO_0000115
   "A psychological phenomenon that occurs when people in a group tend to make non-optimal decisions based on their desire to conform to the group, or fear of dissenting with the group. In groupthink, individuals often refrain from expressing their personal disagreement with the group, hesitating to voice opinions that do not align with the group.",
   :oboInOwl/hasExactSynonym "Groupthink",
   :rdf/type :owl/Class,
   :rdfs/label "Groupthink Bias",
   :rdfs/subClassOf :aio/Group_Bias})

(def Hard_Sigmoid_Function
  {:db/ident :aio/Hard_Sigmoid_Function,
   :obo/IAO_0000115
   "A faster approximation of the sigmoid activation. Piecewise linear approximation of the sigmoid function. Ref: 'https://en.wikipedia.org/wiki/Hard_sigmoid'",
   :rdf/type :owl/Class,
   :rdfs/label "Hard Sigmoid Function",
   :rdfs/subClassOf :aio/Function})

(def Hashing_Layer
  {:db/ident :aio/Hashing_Layer,
   :obo/IAO_0000115
   "A preprocessing layer which hashes and bins categorical features. This layer transforms categorical inputs to hashed output. It element-wise converts a ints or strings to ints in a fixed range. The stable hash function uses tensorflow::ops::Fingerprint to produce the same output consistently across all platforms. This layer uses FarmHash64 by default, which provides a consistent hashed output across different platforms and is stable across invocations, regardless of device and context, by mixing the input bits thoroughly. If you want to obfuscate the hashed output, you can also pass a random salt argument in the constructor. In that case, the layer will use the SipHash64 hash function, with the salt value serving as additional input to the hash function.",
   :rdf/type :owl/Class,
   :rdfs/label "Hashing Layer",
   :rdfs/subClassOf :aio/Categorical_Features_Preprocessing_Layer})

(def Hidden_Layer
  {:db/ident :aio/Hidden_Layer,
   :obo/IAO_0000115
   "A hidden layer is located between the input and output of the algorithm, in which the function applies weights to the inputs and directs them through an activation function as the output. In short, the hidden layers perform nonlinear transformations of the inputs entered into the network. Hidden layers vary depending on the function of the neural network, and similarly, the layers may vary depending on their associated weights.",
   :rdf/type :owl/Class,
   :rdfs/label "Hidden Layer",
   :rdfs/subClassOf :aio/Layer})

(def Hierarchical_Classification
  {:db/ident        :aio/Hierarchical_Classification,
   :obo/IAO_0000115 "Methods that group things according to a hierarchy.",
   :rdf/type        :owl/Class,
   :rdfs/label      "Hierarchical Classification",
   :rdfs/subClassOf :aio/Classification})

(def Hierarchical_Clustering
  {:db/ident        :aio/Hierarchical_Clustering,
   :obo/IAO_0000115 "Methods that seek to build a hierarchy of clusters.",
   :oboInOwl/hasExactSynonym "HCL",
   :rdf/type        :owl/Class,
   :rdfs/label      "Hierarchical Clustering",
   :rdfs/subClassOf :aio/Clustering})

(def Historical_Bias
  {:db/ident :aio/Historical_Bias,
   :obo/IAO_0000115
   "Referring to the long-standing biases encoded in society over time. Related to, but distinct from, biases in historical description, or the interpretation, analysis, and explanation of history. A common example of historical bias is the tendency to view the larger world from a Western or European view.",
   :rdf/type :owl/Class,
   :rdfs/label "Historical Bias",
   :rdfs/subClassOf :aio/Bias})

(def Hopfield_Network
  {:db/ident :aio/Hopfield_Network,
   :obo/IAO_0000115
   "A Hopfield network is a form of recurrent artificial neural network and a type of spin glass system popularised by John Hopfield in 1982 as described earlier by Little in 1974 based on Ernst Ising's work with Wilhelm Lenz on the Ising model. Hopfield networks serve as content-addressable (\"associative\") memory systems with binary threshold nodes, or with continuous variables. Hopfield networks also provide a model for understanding human memory. (https://en.wikipedia.org/wiki/Hopfield_network)",
   :oboInOwl/hasExactSynonym #{"Ising model of a neural network"
                               "Ising–Lenz–Little model" "HN"},
   :rdf/type :owl/Class,
   :rdfs/comment "Backfed input",
   :rdfs/label "Hopfield Network",
   :rdfs/subClassOf :aio/SCN})

(def Hostile_Attribution_Bias
  {:db/ident :aio/Hostile_Attribution_Bias,
   :obo/IAO_0000115
   "A bias wherein individuals perceive benign or ambiguous behaviors as hostile.",
   :rdf/type :owl/Class,
   :rdfs/label "Hostile Attribution Bias",
   :rdfs/subClassOf :aio/Use_And_Interpretation_Bias})

(def Human_Bias
  {:db/ident :aio/Human_Bias,
   :obo/IAO_0000115
   "Systematic errors in human thought based on a limited number of heuristic principles and predicting values to simpler judgmental operations.",
   :rdf/type :owl/Class,
   :rdfs/label "Human Bias",
   :rdfs/subClassOf :aio/Bias})

(def Human_Reporting_Bias
  {:db/ident :aio/Human_Reporting_Bias,
   :obo/IAO_0000115
   "When users rely on automation as a heuristic replacement for their own information seeking and processing.",
   :rdf/type :owl/Class,
   :rdfs/label "Human Reporting Bias",
   :rdfs/subClassOf :aio/Individual_Bias})

(def Image_Augmentation_Layer
  {:db/ident :aio/Image_Augmentation_Layer,
   :obo/IAO_0000115
   "A layer that performs image data preprocessing augmentations.",
   :rdf/type :owl/Class,
   :rdfs/label "Image Augmentation Layer",
   :rdfs/subClassOf :aio/Layer})

(def Image_Preprocessing_Layer
  {:db/ident :aio/Image_Preprocessing_Layer,
   :obo/IAO_0000115
   "A layer that performs image data preprocessing operations.",
   :rdf/type :owl/Class,
   :rdfs/label "Image Preprocessing Layer",
   :rdfs/subClassOf :aio/Layer})

(def Implicit_Bias
  {:db/ident :aio/Implicit_Bias,
   :obo/IAO_0000115
   "An unconscious belief, attitude, feeling, association, or stereotype that can affect the way in which humans process information, make decisions, and take actions.",
   :oboInOwl/hasExactSynonym "Confirmatory Bias",
   :rdf/type :owl/Class,
   :rdfs/label "Implicit Bias",
   :rdfs/subClassOf :aio/Individual_Bias})

(def Incremenetal_Few-shot_Learning
  {:db/ident :aio/Incremenetal_Few-shot_Learning,
   :obo/IAO_0000115
   "Methods that train a network on a base set of classes and then is presented several novel classes, each with only a few labeled examples.",
   :oboInOwl/hasExactSynonym "IFSL",
   :rdf/type :owl/Class,
   :rdfs/label "Incremenetal Few-shot Learning",
   :rdfs/subClassOf :aio/DNN})

(def Individual_Bias
  {:db/ident :aio/Individual_Bias,
   :obo/IAO_0000115
   "Individual bias is a persistent point of view or limited list of such points of view that one applies (\"parent\", \"academic\", \"professional\", or etc.).",
   :rdf/type :owl/Class,
   :rdfs/label "Individual Bias",
   :rdfs/subClassOf :aio/Bias})

(def Inherited_Bias
  {:db/ident :aio/Inherited_Bias,
   :obo/IAO_0000115
   "Arises when applications that are built with machine Learning are used to generate inputs for other machine Learning algorithms. If the output is biased in any way, this bias may be inherited by systems using the output as input to learn other models.",
   :rdf/type :owl/Class,
   :rdfs/label "Inherited Bias",
   :rdfs/subClassOf :aio/Processing_Bias})

(def InputLayer_Layer
  {:db/ident :aio/InputLayer_Layer,
   :obo/IAO_0000115
   "Layer to be used as an entry point into a Network (a graph of layers).",
   :rdf/type :owl/Class,
   :rdfs/label "InputLayer Layer",
   :rdfs/subClassOf :aio/Layer})

(def InputSpec_Layer
  {:db/ident :aio/InputSpec_Layer,
   :obo/IAO_0000115
   "Specifies the rank, dtype and shape of every input to a layer. Layers can expose (if appropriate) an input_spec attribute: an instance of InputSpec, or a nested structure of InputSpec instances (one per input tensor). These objects enable the layer to run input compatibility checks for input structure, input rank, input shape, and input dtype. A None entry in a shape is compatible with any dimension, a None shape is compatible with any shape.",
   :rdf/type :owl/Class,
   :rdfs/label "InputSpec Layer",
   :rdfs/subClassOf :aio/Layer})

(def Input_Layer
  {:db/ident :aio/Input_Layer,
   :obo/IAO_0000115
   "The input layer of a neural network is composed of artificial input neurons, and brings the initial data into the system for further processing by subsequent layers of artificial neurons. The input layer is the very beginning of the workflow for the artificial neural network.",
   :rdf/type :owl/Class,
   :rdfs/label "Input Layer",
   :rdfs/subClassOf :aio/Layer})

(def InstanceNorm1d_Layer
  {:db/ident :aio/InstanceNorm1d_Layer,
   :obo/IAO_0000115
   "Applies Instance Normalization over a 2D (unbatched) or 3D (batched) input as described in the paper Instance Normalization: The Missing Ingredient for Fast Stylization.",
   :oboInOwl/hasExactSynonym #{"InstanceNorm1D" "nn.InstanceNorm1d"
                               "InstanceNorm1d"},
   :rdf/type :owl/Class,
   :rdfs/label "InstanceNorm1d Layer",
   :rdfs/subClassOf :aio/Normalization_Layer})

(def InstanceNorm2d
  {:db/ident :aio/InstanceNorm2d,
   :obo/IAO_0000115
   "Applies Instance Normalization over a 4D input (a mini-batch of 2D inputs with additional channel dimension) as described in the paper Instance Normalization: The Missing Ingredient for Fast Stylization.",
   :oboInOwl/hasExactSynonym #{"nn.InstanceNorm2d" "InstanceNorm2D"
                               "InstanceNorm2d"},
   :rdf/type :owl/Class,
   :rdfs/label "InstanceNorm2d",
   :rdfs/subClassOf :aio/Normalization_Layer})

(def InstanceNorm3d_Layer
  {:db/ident :aio/InstanceNorm3d_Layer,
   :obo/IAO_0000115
   "Applies Instance Normalization over a 5D input (a mini-batch of 3D inputs with additional channel dimension) as described in the paper Instance Normalization: The Missing Ingredient for Fast Stylization.",
   :oboInOwl/hasExactSynonym #{"nn.InstanceNorm3d" "InstanceNorm3d"
                               "InstanceNorm3D"},
   :rdf/type :owl/Class,
   :rdfs/label "InstanceNorm3d Layer",
   :rdfs/subClassOf :aio/Normalization_Layer})

(def Institutional_Bias
  {:db/ident :aio/Institutional_Bias,
   :obo/IAO_0000115
   "In contrast to biases exhibited at the level of individual persons, institutional bias refers to a tendency exhibited at the level of entire institutions, where practices or norms result in the favoring or disadvantaging of certain social groups. Common examples include institutional racism and institutional sexism.",
   :rdf/type :owl/Class,
   :rdfs/label "Institutional Bias",
   :rdfs/subClassOf :aio/Bias})

(def IntegerLookup_Layer
  {:db/ident :aio/IntegerLookup_Layer,
   :obo/IAO_0000115
   "A preprocessing layer which maps integer features to contiguous ranges.",
   :rdf/type :owl/Class,
   :rdfs/label "IntegerLookup Layer",
   :rdfs/subClassOf :aio/Categorical_Features_Preprocessing_Layer})

(def Interpretation_Bias
  {:db/ident :aio/Interpretation_Bias,
   :obo/IAO_0000115
   "A form of information processing bias that can occur when users interpret algorithmic outputs according to their internalized biases and views.",
   :rdf/type :owl/Class,
   :rdfs/label "Interpretation Bias",
   :rdfs/subClassOf :aio/Individual_Bias})

(def K-nearest_Neighbor_Algorithm
  {:db/ident :aio/K-nearest_Neighbor_Algorithm,
   :obo/IAO_0000115
   "An algorithm to group objects by a plurality vote of its neighbors, with the object being assigned to the class most common among its k nearest neighbors",
   :oboInOwl/hasExactSynonym #{"K-NN" "KNN"},
   :rdf/type :owl/Class,
   :rdfs/label "K-nearest Neighbor Algorithm",
   :rdfs/subClassOf :aio/Machine_Learning})

(def K-nearest_Neighbor_Classification_Algorithm
  {:db/ident :aio/K-nearest_Neighbor_Classification_Algorithm,
   :obo/IAO_0000115
   "An algorithm to classify objects by a plurality vote of its neighbors, with the object being assigned to the class most common among its k nearest neighbors",
   :oboInOwl/hasExactSynonym #{"K-NN" "KNN"},
   :rdf/type :owl/Class,
   :rdfs/label "K-nearest Neighbor Classification Algorithm",
   :rdfs/subClassOf #{:aio/Classification :aio/Clustering}})

(def K-nearest_Neighbor_Regression_Algorithm
  {:db/ident :aio/K-nearest_Neighbor_Regression_Algorithm,
   :obo/IAO_0000115
   "An algorithm to assign the average of the values of k nearest neighbors to objects.",
   :oboInOwl/hasExactSynonym #{"K-NN" "KNN"},
   :rdf/type :owl/Class,
   :rdfs/label "K-nearest Neighbor Regression Algorithm",
   :rdfs/subClassOf :aio/Regression_Analysis})

(def Kohonen_Network
  {:db/ident :aio/Kohonen_Network,
   :obo/IAO_0000115
   "A self-organizing map (SOM) or self-organizing feature map (SOFM) is an unsupervised machine Learning technique used to produce a low-dimensional (typically two-dimensional) representation of a higher dimensional data set while preserving the topological structure of the data. For example, a data set with p variables measured in n observations could be represented as clusters of observations with similar values for the variables. These clusters then could be visualized as a two-dimensional \"map\" such that observations in proximal clusters have more similar values than observations in distal clusters. This can make high-dimensional data easier to visualize and analyze. An SOM is a type of artificial neural network but is trained using competitive Learning rather than the error-correction Learning (e.g., backpropagation with gradient descent) used by other artificial neural networks. The SOM was introduced by the Finnish professor Teuvo Kohonen in the 1980s and therefore is sometimes called a Kohonen map or Kohonen network.[1][2] The Kohonen map or network is a computationally convenient abstraction building on biological models of neural systems from the 1970s[3] and morphogenesis models dating back to Alan Turing in the 1950s.",
   :oboInOwl/hasExactSynonym #{"SOFM" "Self-Organizing Feature Map" "SOM"
                               "Self-Organizing Map" "KN"},
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Hidden",
   :rdfs/label "Kohonen Network",
   :rdfs/subClassOf :aio/Network})

(def LLM
  {:db/ident :aio/LLM,
   :rdf/type :owl/Class})

(def LPPool1D_Layer
  {:db/ident :aio/LPPool1D_Layer,
   :obo/IAO_0000115
   "Applies a 1D power-average pooling over an input signal composed of several input planes.",
   :oboInOwl/hasExactSynonym #{"LPPool1d" "LPPool1D"},
   :rdf/type :owl/Class,
   :rdfs/label "LPPool1D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def LPPool2D_Layer
  {:db/ident :aio/LPPool2D_Layer,
   :obo/IAO_0000115
   "Applies a 2D power-average pooling over an input signal composed of several input planes.",
   :oboInOwl/hasExactSynonym #{"LPPool2d" "LPPool2D"},
   :rdf/type :owl/Class,
   :rdfs/label "LPPool2D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def LSTM
  {:db/ident :aio/LSTM,
   :rdf/type :owl/Class})

(def LSTMCell_Layer
  {:db/ident        :aio/LSTMCell_Layer,
   :obo/IAO_0000115 "Cell class for the LSTM layer.",
   :rdf/type        :owl/Class,
   :rdfs/label      "LSTMCell Layer",
   :rdfs/subClassOf :aio/Layer})

(def LSTM_Layer
  {:db/ident :aio/LSTM_Layer,
   :obo/IAO_0000115
   "Long Short-Term Memory layer - Hochreiter 1997. Based on available runtime hardware and constraints, this layer will choose different implementations (cuDNN-based or pure-TensorFlow) to maximize the performance. If a GPU is available and all the arguments to the layer meet the requirement of the cuDNN kernel (see below for details), the layer will use a fast cuDNN implementation. The requirements to use the cuDNN implementation are: 1. activation == tanh, 2. recurrent_activation == sigmoid, 3. recurrent_dropout == 0, 4. unroll is False, 5. use_bias is True, 6. Inputs, if use masking, are strictly right-padded, 7. Eager execution is enabled in the outermost context.",
   :rdf/type :owl/Class,
   :rdfs/label "LSTM Layer",
   :rdfs/subClassOf :aio/Recurrent_Layer})

(def Lambda_Layer
  {:db/ident        :aio/Lambda_Layer,
   :obo/IAO_0000115 "Wraps arbitrary expressions as a Layer object.",
   :rdf/type        :owl/Class,
   :rdfs/label      "Lambda Layer",
   :rdfs/subClassOf :aio/Layer})

(def Large_Language_Model
  {:db/ident :aio/Large_Language_Model,
   :obo/IAO_0000115
   "A large language model (LLM) is a language model consisting of a neural network with many parameters (typically billions of weights or more), trained on large quantities of unlabeled text using self-supervised learning or semi-supervised learning.",
   :oboInOwl/hasExactSynonym "LLM",
   :rdf/type :owl/Class,
   :rdfs/label "Large Language Model"})

(def Lasso_Regression
  {:db/ident :aio/Lasso_Regression,
   :obo/IAO_0000115
   "A regression analysis method that performs both variable selection and regularizationin order to enhance the prediction accuracy and interpretability of the resulting statistical model.",
   :rdf/type :owl/Class,
   :rdfs/label "Lasso Regression",
   :rdfs/subClassOf :aio/Regression_Analysis})

(def Layer
  {:db/ident        :aio/Layer,
   :obo/IAO_0000115 "Network layer parent class",
   :rdf/type        :owl/Class,
   :rdfs/label      "Layer"})

(def LayerNorm_Layer
  {:db/ident :aio/LayerNorm_Layer,
   :obo/IAO_0000115
   "Applies Layer Normalization over a mini-batch of inputs as described in the paper Layer Normalization",
   :oboInOwl/hasExactSynonym #{"LayerNorm" "nn.LayerNorm"},
   :rdf/type :owl/Class,
   :rdfs/label "LayerNorm Layer",
   :rdfs/subClassOf :aio/Normalization_Layer})

(def LayerNormalization_Layer
  {:db/ident :aio/LayerNormalization_Layer,
   :obo/IAO_0000115
   "Layer normalization layer (Ba et al., 2016). Normalize the activations of the previous layer for each given example in a batch independently, rather than across a batch like Batch Normalization. i.e. applies a transformation that maintains the mean activation within each example close to 0 and the activation standard deviation close to 1. Given a tensor inputs, moments are calculated and normalization is performed across the axes specified in axis.",
   :rdf/type :owl/Class,
   :rdfs/label "LayerNormalization Layer",
   :rdfs/subClassOf :aio/Normalization_Layer})

(def Layer_Layer
  {:db/ident :aio/Layer_Layer,
   :obo/IAO_0000115
   "This is the class from which all layers inherit. A layer is a callable object that takes as input one or more tensors and that outputs one or more tensors. It involves computation, defined in the call() method, and a state (weight variables). State can be created in various places, at the convenience of the subclass implementer: in __init__(); in the optional build() method, which is invoked by the first __call__() to the layer, and supplies the shape(s) of the input(s), which may not have been known at initialization time; in the first invocation of call(), with some caveats discussed below. Users will just instantiate a layer and then treat it as a callable.",
   :rdf/type :owl/Class,
   :rdfs/label "Layer Layer",
   :rdfs/subClassOf :aio/Layer})

(def LazyBatchNorm1D_Layer
  {:db/ident :aio/LazyBatchNorm1D_Layer,
   :obo/IAO_0000115
   "A torch.nn.BatchNorm1d module with lazy initialization of the num_features argument of the BatchNorm1d that is inferred from the input.size(1).",
   :oboInOwl/hasExactSynonym #{"LazyBatchNorm1d" "LazyBatchNorm1D"
                               "nn.LazyBatchNorm1d"},
   :rdf/type :owl/Class,
   :rdfs/label "LazyBatchNorm1D Layer",
   :rdfs/subClassOf :aio/BatchNormalization_Layer})

(def LazyBatchNorm2D_Layer
  {:db/ident :aio/LazyBatchNorm2D_Layer,
   :obo/IAO_0000115
   "A torch.nn.BatchNorm2d module with lazy initialization of the num_features argument of the BatchNorm2d that is inferred from the input.size(1).",
   :oboInOwl/hasExactSynonym #{"LazyBatchNorm2d" "LazyBatchNorm2D"
                               "nn.LazyBatchNorm2d"},
   :rdf/type :owl/Class,
   :rdfs/label "LazyBatchNorm2D Layer",
   :rdfs/subClassOf :aio/BatchNormalization_Layer})

(def LazyBatchNorm3D_Layer
  {:db/ident :aio/LazyBatchNorm3D_Layer,
   :obo/IAO_0000115
   "A torch.nn.BatchNorm3d module with lazy initialization of the num_features argument of the BatchNorm3d that is inferred from the input.size(1).",
   :oboInOwl/hasExactSynonym #{"LazyBatchNorm3d" "nn.LazyBatchNorm3d"
                               "LazyBatchNorm3D"},
   :rdf/type :owl/Class,
   :rdfs/label "LazyBatchNorm3D Layer",
   :rdfs/subClassOf :aio/BatchNormalization_Layer})

(def LazyInstanceNorm1d_Layer
  {:db/ident :aio/LazyInstanceNorm1d_Layer,
   :obo/IAO_0000115
   "A torch.nn.InstanceNorm1d module with lazy initialization of the num_features argument of the InstanceNorm1d that is inferred from the input.size(1).",
   :oboInOwl/hasExactSynonym #{"nn.LazyInstanceNorm1d" "LazyInstanceNorm1D"
                               "LazyInstanceNorm1d"},
   :rdf/type :owl/Class,
   :rdfs/label "LazyInstanceNorm1d Layer",
   :rdfs/subClassOf :aio/Normalization_Layer})

(def LazyInstanceNorm2d_Layer
  {:db/ident :aio/LazyInstanceNorm2d_Layer,
   :obo/IAO_0000115
   "A torch.nn.InstanceNorm2d module with lazy initialization of the num_features argument of the InstanceNorm2d that is inferred from the input.size(1).",
   :oboInOwl/hasExactSynonym #{"nn.LazyInstanceNorm2d" "LazyInstanceNorm2d"
                               "LazyInstanceNorm2D"},
   :rdf/type :owl/Class,
   :rdfs/label "LazyInstanceNorm2d Layer",
   :rdfs/subClassOf :aio/Normalization_Layer})

(def LazyInstanceNorm3d_Layer
  {:db/ident :aio/LazyInstanceNorm3d_Layer,
   :obo/IAO_0000115
   "A torch.nn.InstanceNorm3d module with lazy initialization of the num_features argument of the InstanceNorm3d that is inferred from the input.size(1).",
   :oboInOwl/hasExactSynonym #{"LazyInstanceNorm3d" "LazyInstanceNorm3D"
                               "nn.LazyInstanceNorm3d"},
   :rdf/type :owl/Class,
   :rdfs/label "LazyInstanceNorm3d Layer",
   :rdfs/subClassOf :aio/Normalization_Layer})

(def LeakyReLU_Layer
  {:db/ident        :aio/LeakyReLU_Layer,
   :obo/IAO_0000115 "Leaky version of a Rectified Linear Unit.",
   :rdf/type        :owl/Class,
   :rdfs/label      "LeakyReLU Layer",
   :rdfs/subClassOf :aio/Activation_Layer})

(def Least-squares_Analysis
  {:db/ident :aio/Least-squares_Analysis,
   :obo/IAO_0000115
   "A standard approach in regression analysis to approximate the solution of overdetermined systems(sets of equations in which there are more equations than unknowns) by minimizing the sum of the squares of the residuals (a residual being the difference between an observed value and the fitted value provided by a model) made in the results of each individual equation.",
   :rdf/type :owl/Class,
   :rdfs/label "Least-squares Analysis",
   :rdfs/subClassOf :aio/Regression_Analysis})

(def Linear_Function
  {:db/ident        :aio/Linear_Function,
   :obo/IAO_0000115 "A linear function has the form f(x) = a + bx.",
   :rdf/type        :owl/Class,
   :rdfs/label      "Linear Function",
   :rdfs/subClassOf :aio/Function})

(def Linear_Regression
  {:db/ident :aio/Linear_Regression,
   :obo/IAO_0000115
   "A linear approach for modelling the relationship between a scalar response and one or more explanatory variables (also known as dependent and independent variables).",
   :rdf/type :owl/Class,
   :rdfs/label "Linear Regression",
   :rdfs/subClassOf :aio/Regression_Analysis})

(def Linking_Bias
  {:db/ident :aio/Linking_Bias,
   :obo/IAO_0000115
   "Arises when network attributes obtained from user connections, activities, or interactions differ and misrepresent the true behavior of the users.",
   :rdf/type :owl/Class,
   :rdfs/label "Linking Bias",
   :rdfs/subClassOf :aio/Use_And_Interpretation_Bias})

(def Liquid_State_Machine_Network
  {:db/ident :aio/Liquid_State_Machine_Network,
   :obo/IAO_0000115
   "A liquid state machine (LSM) is a type of reservoir computer that uses a spiking neural network. An LSM consists of a large collection of units (called nodes, or neurons). Each node receives time varying input from external sources (the inputs) as well as from other nodes. Nodes are randomly connected to each other. The recurrent nature of the connections turns the time varying input into a spatio-temporal pattern of activations in the network nodes. The spatio-temporal patterns of activation are read out by linear discriminant units. The soup of recurrently connected nodes will end up computing a large variety of nonlinear functions on the input. Given a large enough variety of such nonlinear functions, it is theoretically possible to obtain linear combinations (using the read out units) to perform whatever mathematical operation is needed to perform a certain task, such as speech recognition or computer vision. The word liquid in the name comes from the analogy drawn to dropping a stone into a still body of water or other liquid. The falling stone will generate ripples in the liquid. The input (motion of the falling stone) has been converted into a spatio-temporal pattern of liquid displacement (ripples). (https://en.wikipedia.org/wiki/Liquid_state_machine)",
   :oboInOwl/hasExactSynonym "LSM",
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Spiking Hidden, Output",
   :rdfs/label "Liquid State Machine Network",
   :rdfs/subClassOf :aio/Network})

(def LocalResponseNorm_Layer
  {:db/ident :aio/LocalResponseNorm_Layer,
   :obo/IAO_0000115
   "Applies local response normalization over an input signal composed of several input planes, where channels occupy the second dimension.",
   :oboInOwl/hasExactSynonym #{"nn.LocalResponseNorm" "LocalResponseNorm"},
   :rdf/type :owl/Class,
   :rdfs/label "LocalResponseNorm Layer",
   :rdfs/subClassOf :aio/Normalization_Layer})

(def Locally-connected_Layer
  {:db/ident :aio/Locally-connected_Layer,
   :obo/IAO_0000115
   "The LocallyConnected1D layer works similarly to the Convolution1D layer, except that weights are unshared, that is, a different set of filters is applied at each different patch of the input.",
   :rdf/type :owl/Class,
   :rdfs/label "Locally-connected Layer",
   :rdfs/subClassOf :aio/Layer})

(def LocallyConnected1D_Layer
  {:db/ident :aio/LocallyConnected1D_Layer,
   :obo/IAO_0000115
   "Locally-connected layer for 1D inputs. The LocallyConnected1D layer works similarly to the Conv1D layer, except that weights are unshared, that is, a different set of filters is applied at each different patch of the input.",
   :rdf/type :owl/Class,
   :rdfs/label "LocallyConnected1D Layer",
   :rdfs/subClassOf :aio/Locally-connected_Layer})

(def LocallyConnected2D_Layer
  {:db/ident :aio/LocallyConnected2D_Layer,
   :obo/IAO_0000115
   "Locally-connected layer for 2D inputs. The LocallyConnected2D layer works similarly to the Conv2D layer, except that weights are unshared, that is, a different set of filters is applied at each different patch of the input.",
   :rdf/type :owl/Class,
   :rdfs/label "LocallyConnected2D Layer",
   :rdfs/subClassOf :aio/Locally-connected_Layer})

(def Logistic_Regression
  {:db/ident :aio/Logistic_Regression,
   :obo/IAO_0000115
   "A statistical model that models the probability of an event taking place by having the log-odds for the event be a linear combination of one or more independent variables.",
   :rdf/type :owl/Class,
   :rdfs/label "Logistic Regression",
   :rdfs/subClassOf :aio/Regression_Analysis})

(def Long_Short_Term_Memory
  {:db/ident :aio/Long_Short_Term_Memory,
   :obo/IAO_0000115
   "Long short-term memory (LSTM) is an artificial recurrent neural network (RNN) architecture used in the field of deep Learning. Unlike standard feedforward neural networks, LSTM has feedback connections. It can process not only single data points (such as images), but also entire sequences of data (such as speech or video). For example, LSTM is applicable to tasks such as unsegmented, connected handwriting recognition, speech recognition and anomaly detection in network traffic or IDSs (intrusion detection systems). A common LSTM unit is composed of a cell, an input gate, an output gate and a forget gate. The cell remembers values over arbitrary time intervals and the three gates regulate the flow of information into and out of the cell.",
   :oboInOwl/hasExactSynonym "LSTM",
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Memory Cell, Output",
   :rdfs/label "Long Short Term Memory",
   :rdfs/subClassOf :aio/RecNN})

(def Loss_Of_Situational_Awareness_Bias
  {:db/ident :aio/Loss_Of_Situational_Awareness_Bias,
   :obo/IAO_0000115
   "When automation leads to humans being unaware of their situation such that, when control of a system is given back to them in a situation where humans and machines cooperate, they are unprepared to assume their duties. This can be a loss of awareness over what automation is and isn’t taking care of.",
   :rdf/type :owl/Class,
   :rdfs/label "Loss Of Situational Awareness Bias",
   :rdfs/subClassOf :aio/Individual_Bias})

(def Machine_Learning
  {:db/ident :aio/Machine_Learning,
   :obo/IAO_0000115
   "A field of inquiry devoted to understanding and building methods that 'learn', that is, methods that leverage data to improve performance on some set of tasks.",
   :rdf/type :owl/Class,
   :rdfs/label "Machine Learning",
   :rdfs/subClassOf :aio/Method})

(def Manifold_Learning
  {:db/ident :aio/Manifold_Learning,
   :obo/IAO_0000115
   "Methods based on the assumption that one's observed data lie on a low-dimensional manifold embedded in a higher-dimensional space.",
   :rdf/type :owl/Class,
   :rdfs/label "Manifold Learning",
   :rdfs/subClassOf :aio/Dimensionality_Reduction})

(def Markov_Chain
  {:db/ident :aio/Markov_Chain,
   :obo/IAO_0000115
   "A Markov chain or Markov process is a stochastic model describing a sequence of possible events in which the probability of each event depends only on the state attained in the previous event.[1][2][3] A countably infinite sequence, in which the chain moves state at discrete time steps, gives a discrete-time Markov chain (DTMC). A continuous-time process is called a continuous-time Markov chain (CTMC). It is named after the Russian mathematician Andrey Markov.",
   :oboInOwl/hasExactSynonym #{"MP" "Markov Process" "MC"},
   :rdf/type :owl/Class,
   :rdfs/comment "Probalistic Hidden",
   :rdfs/label "Markov Chain",
   :rdfs/subClassOf :aio/Network})

(def Masking_Layer
  {:db/ident :aio/Masking_Layer,
   :obo/IAO_0000115
   "Masks a sequence by using a mask value to skip timesteps. For each timestep in the input tensor (dimension #1 in the tensor), if all values in the input tensor at that timestep are equal to mask_value, then the timestep will be masked (skipped) in all downstream layers (as long as they support masking). If any downstream layer does not support masking yet receives such an input mask, an exception will be raised.",
   :rdf/type :owl/Class,
   :rdfs/label "Masking Layer",
   :rdfs/subClassOf :aio/Layer})

(def MaxPooling1D_Layer
  {:db/ident :aio/MaxPooling1D_Layer,
   :obo/IAO_0000115
   "Max pooling operation for 1D temporal data. Downsamples the input representation by taking the maximum value over a spatial window of size pool_size. The window is shifted by strides. The resulting output, when using the \"valid\" padding option, has a shape of: output_shape = (input_shape - pool_size + 1) / strides) The resulting output shape when using the \"same\" padding option is: output_shape = input_shape / strides.",
   :oboInOwl/hasExactSynonym #{"MaxPool1d" "MaxPooling1d" "MaxPooling1D"
                               "MaxPool1D"},
   :rdf/type :owl/Class,
   :rdfs/label "MaxPooling1D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def MaxPooling2D_Layer
  {:db/ident        :aio/MaxPooling2D_Layer,
   :obo/IAO_0000115 "Max pooling operation for 2D spatial data.",
   :oboInOwl/hasExactSynonym #{"MaxPooling2D" "MaxPool2d" "MaxPool2D"
                               "MaxPooling2d"},
   :rdf/type        :owl/Class,
   :rdfs/label      "MaxPooling2D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def MaxPooling3D_Layer
  {:db/ident :aio/MaxPooling3D_Layer,
   :obo/IAO_0000115
   "Max pooling operation for 3D data (spatial or spatio-temporal). Downsamples the input along its spatial dimensions (depth, height, and width) by taking the maximum value over an input window (of size defined by pool_size) for each channel of the input. The window is shifted by strides along each dimension.",
   :oboInOwl/hasExactSynonym #{"MaxPooling3d" "MaxPooling3D" "MaxPool3D"
                               "MaxPool3d"},
   :rdf/type :owl/Class,
   :rdfs/label "MaxPooling3D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def MaxUnpool1D_Layer
  {:db/ident        :aio/MaxUnpool1D_Layer,
   :obo/IAO_0000115 "Computes a partial inverse of MaxPool1d.",
   :oboInOwl/hasExactSynonym #{"MaxUnpool1d" "MaxUnpool1D"},
   :rdf/type        :owl/Class,
   :rdfs/label      "MaxUnpool1D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def MaxUnpool2D_Layer
  {:db/ident        :aio/MaxUnpool2D_Layer,
   :obo/IAO_0000115 "Computes a partial inverse of MaxPool2d.",
   :oboInOwl/hasExactSynonym #{"MaxUnpool2D" "MaxUnpool2d"},
   :rdf/type        :owl/Class,
   :rdfs/label      "MaxUnpool2D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def MaxUnpool3D_Layer
  {:db/ident        :aio/MaxUnpool3D_Layer,
   :obo/IAO_0000115 "Computes a partial inverse of MaxPool3d.",
   :oboInOwl/hasExactSynonym #{"MaxUnpool3d" "MaxUnpool3D"},
   :rdf/type        :owl/Class,
   :rdfs/label      "MaxUnpool3D Layer",
   :rdfs/subClassOf :aio/Pooling_Layer})

(def Maximum_Layer
  {:db/ident :aio/Maximum_Layer,
   :obo/IAO_0000115
   "Layer that computes the maximum (element-wise) a list of inputs. It takes as input a list of tensors, all of the same shape, and returns a single tensor (also of the same shape).",
   :rdf/type :owl/Class,
   :rdfs/label "Maximum Layer",
   :rdfs/subClassOf :aio/Merging_Layer})

(def Measurement_Bias
  {:db/ident :aio/Measurement_Bias,
   :obo/IAO_0000115
   "Arises when features and labels are proxies for desired quantities, potentially leaving out important factors or introducing group or input-dependent noise that leads to differential performance.",
   :rdf/type :owl/Class,
   :rdfs/label "Measurement Bias",
   :rdfs/subClassOf :aio/Selection_And_Sampling_Bias})

(def Merging_Layer
  {:db/ident        :aio/Merging_Layer,
   :obo/IAO_0000115 "A layer used to merge a list of inputs.",
   :rdf/type        :owl/Class,
   :rdfs/label      "Merging Layer",
   :rdfs/subClassOf :aio/Layer})

(def Meta-Learning
  {:db/ident :aio/Meta-Learning,
   :obo/IAO_0000115
   "Automatic learning algorithms applied to metadata about machine Learning experiments.",
   :rdf/type :owl/Class,
   :rdfs/label "Meta-Learning",
   :rdfs/subClassOf :aio/Machine_Learning})

(def Method
  {:db/ident        :aio/Method,
   :obo/IAO_0000115 "Method parent class.",
   :rdf/type        :owl/Class,
   :rdfs/label      "Method"})

(def Metric_Learning
  {:db/ident :aio/Metric_Learning,
   :obo/IAO_0000115
   "Methods which can learn a representation function that maps objects into an embedded space.",
   :oboInOwl/hasExactSynonym "Distance Metric Learning",
   :rdf/type :owl/Class,
   :rdfs/label "Metric Learning",
   :rdfs/subClassOf :aio/DNN})

(def Minimum_Layer
  {:db/ident :aio/Minimum_Layer,
   :obo/IAO_0000115
   "Layer that computes the minimum (element-wise) a list of inputs. It takes as input a list of tensors, all of the same shape, and returns a single tensor (also of the same shape).",
   :rdf/type :owl/Class,
   :rdfs/label "Minimum Layer",
   :rdfs/subClassOf :aio/Merging_Layer})

(def Mode_Confusion_Bias
  {:db/ident :aio/Mode_Confusion_Bias,
   :obo/IAO_0000115
   "When modal interfaces confuse human operators, who misunderstand which mode the system is using, taking actions which are correct for a different mode but incorrect for their current situation. This is the cause of many deadly accidents, but also a source of confusion in everyday life.",
   :rdf/type :owl/Class,
   :rdfs/label "Mode Confusion Bias",
   :rdfs/subClassOf :aio/Individual_Bias})

(def Model_Selection_Bias
  {:db/ident :aio/Model_Selection_Bias,
   :obo/IAO_0000115
   "The bias introduced while using the data to select a single seemingly “best” model from a large set of models employing many predictor variables. Model selection bias also occurs when an explanatory variable has a weak relationship with the response variable.",
   :rdf/type :owl/Class,
   :rdfs/label "Model Selection Bias",
   :rdfs/subClassOf :aio/Processing_Bias})

(def MultiHeadAttention_Layer
  {:db/ident :aio/MultiHeadAttention_Layer,
   :obo/IAO_0000115
   "MultiHeadAttention layer. This is an implementation of multi-headed attention as described in the paper \"Attention is all you Need\" (Vaswani et al., 2017). If query, key, value are the same, then this is self-attention. Each timestep in query attends to the corresponding sequence in key, and returns a fixed-width vector.This layer first projects query, key and value. These are (effectively) a list of tensors of length num_attention_heads, where the corresponding shapes are (batch_size, <query dimensions>, key_dim), (batch_size, <key/value dimensions>, key_dim), (batch_size, <key/value dimensions>, value_dim).Then, the query and key tensors are dot-producted and scaled. These are softmaxed to obtain attention probabilities. The value tensors are then interpolated by these probabilities, then concatenated back to a single tensor. Finally, the result tensor with the last dimension as value_dim can take an linear projection and return. When using MultiHeadAttention inside a custom Layer, the custom Layer must implement build() and call MultiHeadAttention's _build_from_signature(). This enables weights to be restored correctly when the model is loaded.",
   :rdf/type :owl/Class,
   :rdfs/label "MultiHeadAttention Layer",
   :rdfs/subClassOf :aio/Attention_Layer})

(def Multiclass_Classification
  {:db/ident :aio/Multiclass_Classification,
   :obo/IAO_0000115
   "Methods that lassify instances into one of three or more classes (classifying instances into one of two classes is called binary classification).",
   :oboInOwl/hasExactSynonym "Multinomial Classification",
   :rdf/type :owl/Class,
   :rdfs/label "Multiclass Classification",
   :rdfs/subClassOf :aio/Classification})

(def Multidimensional_Scaling
  {:db/ident :aio/Multidimensional_Scaling,
   :obo/IAO_0000115
   "A method that translates information about the pairwise distances among a set of objects or individuals into a configuration of points mapped into an abstract Cartesian space.",
   :oboInOwl/hasExactSynonym "MDS",
   :rdf/type :owl/Class,
   :rdfs/label "Multidimensional Scaling",
   :rdfs/subClassOf :aio/Dimensionality_Reduction})

(def Multimodal_Deep_Learning
  {:db/ident :aio/Multimodal_Deep_Learning,
   :obo/IAO_0000115
   "Methods which can create models that can process and link information using various modalities.",
   :rdf/type :owl/Class,
   :rdfs/label "Multimodal Deep Learning",
   :rdfs/subClassOf :aio/DNN})

(def Multimodal_Learning
  {:db/ident :aio/Multimodal_Learning,
   :obo/IAO_0000115
   "Methods which can represent the joint representations of different modalities.",
   :rdf/type :owl/Class,
   :rdfs/label "Multimodal Learning",
   :rdfs/subClassOf :aio/Machine_Learning})

(def Multiply_Layer
  {:db/ident :aio/Multiply_Layer,
   :obo/IAO_0000115
   "Layer that multiplies (element-wise) a list of inputs. It takes as input a list of tensors, all of the same shape, and returns a single tensor (also of the same shape).",
   :rdf/type :owl/Class,
   :rdfs/label "Multiply Layer",
   :rdfs/subClassOf :aio/Merging_Layer})

(def Natural_Language_Processing
  {:db/ident :aio/Natural_Language_Processing,
   :obo/IAO_0000115
   "A subfield of linguistics, computer science, and artificial intelligence concerned with the interactions between computers and human language, in particular how to program computers to process and analyze large amounts of natural language data.",
   :oboInOwl/hasExactSynonym "NLP",
   :rdf/type :owl/Class,
   :rdfs/label "Natural Language Processing",
   :rdfs/subClassOf :aio/Machine_Learning})

(def Network
  {:db/ident        :aio/Network,
   :obo/IAO_0000115 "Network parent class",
   :rdf/type        :owl/Class,
   :rdfs/label      "Network"})

(def Neural_Turing_Machine_Network
  {:db/ident :aio/Neural_Turing_Machine_Network,
   :obo/IAO_0000115
   "A Neural Turing machine (NTMs) is a recurrent neural network model. The approach was published by Alex Graves et al. in 2014. NTMs combine the fuzzy pattern matching capabilities of neural networks with the algorithmic power of programmable computers. An NTM has a neural network controller coupled to external memory resources, which it interacts with through attentional mechanisms. The memory interactions are differentiable end-to-end, making it possible to optimize them using gradient descent. An NTM with a long short-term memory (LSTM) network controller can infer simple algorithms such as copying, sorting, and associative recall from examples alone.",
   :oboInOwl/hasExactSynonym "NTM",
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Hidden, Spiking Hidden, Output",
   :rdfs/label "Neural Turing Machine Network",
   :rdfs/subClassOf #{:aio/DFF :aio/LSTM}})

(def Noise_Dense_Layer
  {:db/ident :aio/Noise_Dense_Layer,
   :obo/IAO_0000115
   "Noisy dense layer that injects random noise to the weights of dense layer. Noisy dense layers are fully connected layers whose weights and biases are augmented by factorised Gaussian noise. The factorised Gaussian noise is controlled through gradient descent by a second weights layer. A NoisyDense layer implements the operation: $$ mathrm{NoisyDense}(x) = mathrm{activation}(mathrm{dot}(x, mu + (sigma cdot epsilon)) mathrm{bias}) $$ where mu is the standard weights layer, epsilon is the factorised Gaussian noise, and delta is a second weights layer which controls epsilon.",
   :rdf/type :owl/Class,
   :rdfs/label "Noise Dense Layer",
   :rdfs/subClassOf :aio/Layer})

(def Normalization_Layer
  {:db/ident :aio/Normalization_Layer,
   :obo/IAO_0000115
   "A preprocessing layer which normalizes continuous features.",
   :rdf/type :owl/Class,
   :rdfs/label "Normalization Layer",
   :rdfs/subClassOf :aio/Numerical_Features_Preprocessing_Layer})

(def Numerical_Features_Preprocessing_Layer
  {:db/ident :aio/Numerical_Features_Preprocessing_Layer,
   :obo/IAO_0000115
   "A layer that performs numerical data preprocessing operations.",
   :rdf/type :owl/Class,
   :rdfs/label "Numerical Features Preprocessing Layer",
   :rdfs/subClassOf :aio/Layer})

(def One-shot_Learning
  {:db/ident :aio/One-shot_Learning,
   :obo/IAO_0000115
   "A method which aims to classify objects from one, or only a few, examples.",
   :oboInOwl/hasExactSynonym "OSL",
   :rdf/type :owl/Class,
   :rdfs/label "One-shot Learning",
   :rdfs/subClassOf :aio/DNN})

(def Output_Layer
  {:db/ident :aio/Output_Layer,
   :obo/IAO_0000115
   "The output layer in an artificial neural network is the last layer of neurons that produces given outputs for the program. Though they are made much like other artificial neurons in the neural network, output layer neurons may be built or observed in a different way, given that they are the last “actor” nodes on the network.",
   :rdf/type :owl/Class,
   :rdfs/label "Output Layer",
   :rdfs/subClassOf :aio/Layer})

(def PReLU_Layer
  {:db/ident        :aio/PReLU_Layer,
   :obo/IAO_0000115 "Parametric Rectified Linear Unit.",
   :rdf/type        :owl/Class,
   :rdfs/label      "PReLU Layer",
   :rdfs/subClassOf :aio/Activation_Layer})

(def Perceptron
  {:db/ident :aio/Perceptron,
   :obo/IAO_0000115
   "The perceptron is an algorithm for supervised Learning of binary classifiers. A binary classifier is a function which can decide whether or not an input, represented by a vector of numbers, belongs to some specific class. It is a type of linear classifier, i.e. a classification algorithm that makes its predictions based on a linear predictor function combining a set of weights with the feature vector. (https://en.wikipedia.org/wiki/Perceptron)",
   :oboInOwl/hasExactSynonym #{"SLP" "Single Layer Perceptron"},
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Output",
   :rdfs/label "Perceptron",
   :rdfs/subClassOf :aio/ANN})

(def Permute_Layer
  {:db/ident :aio/Permute_Layer,
   :obo/IAO_0000115
   "Permutes the dimensions of the input according to a given pattern. Useful e.g. connecting RNNs and convnets.",
   :rdf/type :owl/Class,
   :rdfs/label "Permute Layer",
   :rdfs/subClassOf :aio/Reshaping_Layer})

(def Pooling_Layer
  {:db/ident :aio/Pooling_Layer,
   :obo/IAO_0000115
   "Pooling layers serve the dual purposes of mitigating the sensitivity of convolutional layers to location and of spatially downsampling representations.",
   :rdf/type :owl/Class,
   :rdfs/label "Pooling Layer",
   :rdfs/subClassOf :aio/Layer})

(def Popularity_Bias
  {:db/ident :aio/Popularity_Bias,
   :obo/IAO_0000115
   "A form of selection bias that occurs when items that are more popular are more exposed and less popular items are under-represented.",
   :rdf/type :owl/Class,
   :rdfs/label "Popularity Bias",
   :rdfs/subClassOf :aio/Selection_And_Sampling_Bias})

(def Population_Bias
  {:db/ident :aio/Population_Bias,
   :obo/IAO_0000115
   "A form of selection bias that occurs when items that are more popular are more exposed and less popular items are under-represented.aSystematic distortions in demographics or other user characteristics between a population of users represented in a dataset or on a platform and some target population.",
   :rdf/type :owl/Class,
   :rdfs/label "Population Bias",
   :rdfs/subClassOf :aio/Selection_And_Sampling_Bias})

(def Preprocessing_Layer
  {:db/ident        :aio/Preprocessing_Layer,
   :obo/IAO_0000115 "A layer that performs data preprocessing operations.",
   :rdf/type        :owl/Class,
   :rdfs/label      "Preprocessing Layer",
   :rdfs/subClassOf :aio/Layer})

(def Presentation_Bias
  {:db/ident :aio/Presentation_Bias,
   :obo/IAO_0000115
   "Biases arising from how information is presented on the Web, via a user interface, due to rating or ranking of output, or through users’ own self-selected, biased interaction.",
   :rdf/type :owl/Class,
   :rdfs/label "Presentation Bias",
   :rdfs/subClassOf :aio/Individual_Bias})

(def Principal_Component_Analysis
  {:db/ident :aio/Principal_Component_Analysis,
   :obo/IAO_0000115
   "A method for analyzing large datasets containing a high number of dimensions/features per observation, increasing the interpretability of data while preserving the maximum amount of information, and enabling the visualization of multidimensional data.",
   :oboInOwl/hasExactSynonym "PCA",
   :rdf/type :owl/Class,
   :rdfs/label "Principal Component Analysis",
   :rdfs/subClassOf :aio/Dimensionality_Reduction})

(def Probabilistic_Graphical_Model
  {:db/ident :aio/Probabilistic_Graphical_Model,
   :obo/IAO_0000115
   "A probabilistic model for which a graph expresses the conditional dependence structure between random variables.",
   :oboInOwl/hasExactSynonym #{"Graphical Model" "PGM"
                               "Structure Probabilistic Model"},
   :rdf/type :owl/Class,
   :rdfs/label "Probabilistic Graphical Model",
   :rdfs/subClassOf :aio/Machine_Learning})

(def Probabilistic_Topic_Model
  {:db/ident :aio/Probabilistic_Topic_Model,
   :obo/IAO_0000115
   "Methods that use statistical methods to analyze the words in each text to discover common themes, how those themes are connected to each other, and how they change over time.",
   :rdf/type :owl/Class,
   :rdfs/label "Probabilistic Topic Model",
   :rdfs/subClassOf :aio/Probabilistic_Graphical_Model})

(def Processing_Bias
  {:db/ident :aio/Processing_Bias,
   :obo/IAO_0000115
   "Judgement modulated by affect, which is influenced by the level of efficacy and efficiency in information processing; in cognitive sciences, processing bias is often referred to as an aesthetic judgement.",
   :oboInOwl/hasExactSynonym "Validation Bias",
   :rdf/type :owl/Class,
   :rdfs/label "Processing Bias",
   :rdfs/subClassOf :aio/Computational_Bias})

(def Proportional_Hazards_Model
  {:db/ident :aio/Proportional_Hazards_Model,
   :obo/IAO_0000115
   "A surival modeling method where the unique effect of a unit increase in a covariate is multiplicative with respect to the hazard rate.",
   :rdf/type :owl/Class,
   :rdfs/label "Proportional Hazards Model",
   :rdfs/subClassOf #{:aio/Regression_Analysis :aio/Survival_Analysis}})

(def RNN_Layer
  {:db/ident        :aio/RNN_Layer,
   :obo/IAO_0000115 "Base class for recurrent layers.",
   :rdf/type        :owl/Class,
   :rdfs/label      "RNN Layer",
   :rdfs/subClassOf :aio/Recurrent_Layer})

(def Radial_Basis_Network
  {:db/ident :aio/Radial_Basis_Network,
   :obo/IAO_0000115
   "Like recurrent neural networks (RNNs), transformers are designed to handle sequential input data, such as natural language, for tasks such as translation and text summarization. However, unlike RNNs, transformers do not necessarily process the data in order. Rather, the attention mechanism provides context for any position in the input sequence.",
   :oboInOwl/hasExactSynonym #{"Radial Basis Function Network" "RBFN" "RBN"},
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Hidden, Output",
   :rdfs/label "Radial Basis Network",
   :rdfs/subClassOf :aio/DFF})

(def RandomBrightness_Layer
  {:db/ident :aio/RandomBrightness_Layer,
   :obo/IAO_0000115
   "A preprocessing layer which randomly adjusts brightness during training. This layer will randomly increase/reduce the brightness for the input RGB images. At inference time, the output will be identical to the input. Call the layer with training=True to adjust the brightness of the input. Note that different brightness adjustment factors will be apply to each the images in the batch.",
   :rdf/type :owl/Class,
   :rdfs/label "RandomBrightness Layer",
   :rdfs/subClassOf :aio/Layer})

(def RandomContrast_Layer
  {:db/ident :aio/RandomContrast_Layer,
   :obo/IAO_0000115
   "A preprocessing layer which randomly adjusts contrast during training. This layer will randomly adjust the contrast of an image or images by a random factor. Contrast is adjusted independently for each channel of each image during training. For each channel, this layer computes the mean of the image pixels in the channel and then adjusts each component x of each pixel to (x - mean) * contrast_factor + mean. Input pixel values can be of any range (e.g. [0., 1.) or [0, 255]) and in integer or floating point dtype. By default, the layer will output floats. The output value will be clipped to the range [0, 255], the valid range of RGB colors.",
   :rdf/type :owl/Class,
   :rdfs/label "RandomContrast Layer",
   :rdfs/subClassOf :aio/Layer})

(def RandomCrop_Layer
  {:db/ident :aio/RandomCrop_Layer,
   :obo/IAO_0000115
   "A preprocessing layer which randomly crops images during training. During training, this layer will randomly choose a location to crop images down to a target size. The layer will crop all the images in the same batch to the same cropping location. At inference time, and during training if an input image is smaller than the target size, the input will be resized and cropped so as to return the largest possible window in the image that matches the target aspect ratio. If you need to apply random cropping at inference time, set training to True when calling the layer. Input pixel values can be of any range (e.g. [0., 1.) or [0, 255]) and of interger or floating point dtype. By default, the layer will output floats.",
   :rdf/type :owl/Class,
   :rdfs/label "RandomCrop Layer",
   :rdfs/subClassOf :aio/Layer})

(def RandomFlip_Layer
  {:db/ident :aio/RandomFlip_Layer,
   :obo/IAO_0000115
   "A preprocessing layer which randomly flips images during training. This layer will flip the images horizontally and or vertically based on the mode attribute. During inference time, the output will be identical to input. Call the layer with training=True to flip the input. Input pixel values can be of any range (e.g. [0., 1.) or [0, 255]) and of interger or floating point dtype. By default, the layer will output floats.",
   :rdf/type :owl/Class,
   :rdfs/label "RandomFlip Layer",
   :rdfs/subClassOf :aio/Layer})

(def RandomHeight_Layer
  {:db/ident :aio/RandomHeight_Layer,
   :obo/IAO_0000115
   "A preprocessing layer which randomly varies image height during training. This layer adjusts the height of a batch of images by a random factor. The input should be a 3D (unbatched) or 4D (batched) tensor in the \"channels_last\" image data format. Input pixel values can be of any range (e.g. [0., 1.) or [0, 255]) and of interger or floating point dtype. By default, the layer will output floats. By default, this layer is inactive during inference.",
   :rdf/type :owl/Class,
   :rdfs/label "RandomHeight Layer",
   :rdfs/subClassOf :aio/Layer})

(def RandomRotation_Layer
  {:db/ident :aio/RandomRotation_Layer,
   :obo/IAO_0000115
   "A preprocessing layer which randomly rotates images during training.",
   :rdf/type :owl/Class,
   :rdfs/label "RandomRotation Layer",
   :rdfs/subClassOf :aio/Layer})

(def RandomTranslation_Layer
  {:db/ident :aio/RandomTranslation_Layer,
   :obo/IAO_0000115
   "A preprocessing layer which randomly translates images during training. This layer will apply random translations to each image during training, filling empty space according to fill_mode. aInput pixel values can be of any range (e.g. [0., 1.) or [0, 255]) and of interger or floating point dtype. By default, the layer will output floats.",
   :rdf/type :owl/Class,
   :rdfs/label "RandomTranslation Layer",
   :rdfs/subClassOf :aio/Layer})

(def RandomWidth_Layer
  {:db/ident :aio/RandomWidth_Layer,
   :obo/IAO_0000115
   "A preprocessing layer which randomly varies image width during training. This layer will randomly adjusts the width of a batch of images of a batch of images by a random factor. The input should be a 3D (unbatched) or 4D (batched) tensor in the \"channels_last\" image data format. Input pixel values can be of any range (e.g. [0., 1.) or [0, 255]) and of interger or floating point dtype. By default, the layer will output floats. By default, this layer is inactive during inference.",
   :rdf/type :owl/Class,
   :rdfs/label "RandomWidth Layer",
   :rdfs/subClassOf :aio/Layer})

(def RandomZoom_Layer
  {:db/ident :aio/RandomZoom_Layer,
   :obo/IAO_0000115
   "A preprocessing layer which randomly zooms images during training. This layer will randomly zoom in or out on each axis of an image independently, filling empty space according to fill_mode.Input pixel values can be of any range (e.g. [0., 1.) or [0, 255]) and of interger or floating point dtype. By default, the layer will output floats.",
   :rdf/type :owl/Class,
   :rdfs/label "RandomZoom Layer",
   :rdfs/subClassOf :aio/Layer})

(def Random_Effects_Model
  {:db/ident :aio/Random_Effects_Model,
   :obo/IAO_0000115
   "A statistical model where the model parameters are random variables.",
   :oboInOwl/hasExactSynonym "REM",
   :rdf/type :owl/Class,
   :rdfs/label "Random Effects Model",
   :rdfs/subClassOf :aio/Regression_Analysis})

(def Random_Forest
  {:db/ident :aio/Random_Forest,
   :obo/IAO_0000115
   "An ensemble learning method for classification, regression and other tasks that operates by constructing a multitude of decision trees at training time.",
   :rdf/type :owl/Class,
   :rdfs/label "Random Forest",
   :rdfs/subClassOf :aio/Ensemble_Learning})

(def Ranking_Bias
  {:db/ident :aio/Ranking_Bias,
   :obo/IAO_0000115
   "The idea that top-ranked results are the most relevant and important and will result in more clicks than other results.",
   :rdf/type :owl/Class,
   :rdfs/label "Ranking Bias",
   :rdfs/subClassOf :aio/Anchoring_Bias})

(def Rashomon_Effect_Bias
  {:db/ident :aio/Rashomon_Effect_Bias,
   :obo/IAO_0000115
   "Refers to differences in perspective, memory and recall, interpretation, and reporting on the same event from multiple persons or witnesses.",
   :oboInOwl/hasExactSynonym #{"Rashomon Effect" "Rashomon Principle"},
   :rdf/type :owl/Class,
   :rdfs/label "Rashomon Effect Bias",
   :rdfs/subClassOf :aio/Individual_Bias})

(def ReLU_Function
  {:db/ident :aio/ReLU_Function,
   :obo/IAO_0000115
   "The ReLU activation function returns: max(x, 0), the element-wise maximum of 0 and the input tensor.",
   :oboInOwl/hasExactSynonym #{"Rectified Linear Unit" "ReLU"},
   :rdf/type :owl/Class,
   :rdfs/label "ReLU Function",
   :rdfs/subClassOf :aio/Function})

(def ReLU_Layer
  {:db/ident :aio/ReLU_Layer,
   :obo/IAO_0000115
   "Rectified Linear Unit activation function. With default values, it returns element-wise max(x, 0).",
   :rdf/type :owl/Class,
   :rdfs/label "ReLU Layer",
   :rdfs/subClassOf :aio/Activation_Layer})

(def RecNN
  {:db/ident :aio/RecNN,
   :rdf/type :owl/Class})

(def Recurrent_Layer
  {:db/ident :aio/Recurrent_Layer,
   :obo/IAO_0000115
   "A layer of an RNB, composed of recurrent units and with the number of which is the hidden size of the layer.",
   :rdf/type :owl/Class,
   :rdfs/label "Recurrent Layer",
   :rdfs/subClassOf :aio/Layer})

(def Recurrent_Neural_Network
  {:db/ident :aio/Recurrent_Neural_Network,
   :obo/IAO_0000115
   "A recurrent neural network (RNN) is a class of artificial neural networks where connections between nodes form a directed graph along a temporal sequence. This allows it to exhibit temporal dynamic behavior. Derived from feedforward neural networks, RNNs can use their internal state (memory) to process variable length sequences of inputs.",
   :oboInOwl/hasExactSynonym #{"RN" "Recurrent Network" "RecNN"},
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Memory Cell, Output",
   :rdfs/label "Recurrent Neural Network",
   :rdfs/subClassOf :aio/DNN})

(def Recursive_Neural_Network
  {:db/ident :aio/Recursive_Neural_Network,
   :obo/IAO_0000115
   "A recursive neural network is a kind of deep neural network created by applying the same set of weights recursively over a structured input, to produce a structured prediction over variable-size input structures, or a scalar prediction on it, by traversing a given structure in topological order. Recursive neural networks, sometimes abbreviated as RvNNs, have been successful, for instance, in Learning sequence and tree structures in natural language processing, mainly phrase and sentence continuous representations based on word embedding.",
   :oboInOwl/hasExactSynonym #{"RecuNN" "RvNN"},
   :rdf/type :owl/Class,
   :rdfs/label "Recursive Neural Network",
   :rdfs/subClassOf :aio/DNN})

(def Regression_Analysis
  {:db/ident :aio/Regression_Analysis,
   :obo/IAO_0000115
   "A set of statistical processes for estimating the relationships between a dependent variable (often called the 'outcome' or 'response' variable, or a 'label' in machine learning parlance) and one or more independent variables (often called 'predictors', 'covariates', 'explanatory variables' or 'features').",
   :oboInOwl/hasExactSynonym #{"Regression model" "Regression analysis"},
   :rdf/type :owl/Class,
   :rdfs/label "Regression Analysis",
   :rdfs/subClassOf :aio/Supervised_Learning})

(def Regularization_Layer
  {:db/ident :aio/Regularization_Layer,
   :obo/IAO_0000115
   "Regularizers allow you to apply penalties on layer parameters or layer activity during optimization. These penalties are summed into the loss function that the network optimizes. Regularization penalties are applied on a per-layer basis.",
   :rdf/type :owl/Class,
   :rdfs/label "Regularization Layer",
   :rdfs/subClassOf :aio/Layer})

(def Reinforcement_Learning
  {:db/ident :aio/Reinforcement_Learning,
   :obo/IAO_0000115
   "Methods that do not need labelled input/output pairs be presented, nor needing sub-optimal actions to be explicitly corrected. Instead they focus on finding a balance between exploration (of uncharted territory) and exploitation (of current knowledge).",
   :rdf/type :owl/Class,
   :rdfs/label "Reinforcement Learning",
   :rdfs/subClassOf :aio/Machine_Learning})

(def RepeatVector_Layer
  {:db/ident        :aio/RepeatVector_Layer,
   :obo/IAO_0000115 "Repeats the input n times.",
   :rdf/type        :owl/Class,
   :rdfs/label      "RepeatVector Layer",
   :rdfs/subClassOf :aio/Reshaping_Layer})

(def Representation_Bias
  {:db/ident :aio/Representation_Bias,
   :obo/IAO_0000115
   "Arises due to non-random sampling of subgroups, causing trends estimated for one population to not be generalizable to data collected from a new population.",
   :rdf/type :owl/Class,
   :rdfs/label "Representation Bias",
   :rdfs/subClassOf :aio/Selection_And_Sampling_Bias})

(def Representation_Learning
  {:db/ident :aio/Representation_Learning,
   :obo/IAO_0000115
   "Methods that allow a system to discover the representations required for feature detection or classification from raw data.",
   :oboInOwl/hasExactSynonym "Feature Learning",
   :rdf/type :owl/Class,
   :rdfs/label "Representation Learning",
   :rdfs/subClassOf :aio/DNN})

(def Rescaling_Layer
  {:db/ident :aio/Rescaling_Layer,
   :obo/IAO_0000115
   "A preprocessing layer which rescales input values to a new range.",
   :rdf/type :owl/Class,
   :rdfs/label "Rescaling Layer",
   :rdfs/subClassOf :aio/Image_Preprocessing_Layer})

(def Reshape_Layer
  {:db/ident        :aio/Reshape_Layer,
   :obo/IAO_0000115 "Layer that reshapes inputs into the given shape.",
   :rdf/type        :owl/Class,
   :rdfs/label      "Reshape Layer",
   :rdfs/subClassOf :aio/Reshaping_Layer})

(def Reshaping_Layer
  {:db/ident        :aio/Reshaping_Layer,
   :obo/IAO_0000115 "Reshape layers are used to change the shape of the input.",
   :rdf/type        :owl/Class,
   :rdfs/label      "Reshaping Layer",
   :rdfs/subClassOf :aio/Layer})

(def Residual_Neural_Network
  {:db/ident :aio/Residual_Neural_Network,
   :obo/IAO_0000115
   "A residual neural network (ResNet) is an artificial neural network (ANN) of a kind that builds on constructs known from pyramidal cells in the cerebral cortex. Residual neural networks do this by utilizing skip connections, or shortcuts to jump over some layers. Typical ResNet models are implemented with double- or triple- layer skips that contain nonlinearities (ReLU) and batch normalization in between. An additional weight matrix may be used to learn the skip weights; these models are known as HighwayNets. Models with several parallel skips are referred to as DenseNets. In the context of residual neural networks, a non-residual network may be described as a 'plain network'.",
   :oboInOwl/hasExactSynonym #{"Deep Residual Network" "ResNN" "DRN" "ResNet"},
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Weight, BN, ReLU, Weight, BN, Addition, ReLU",
   :rdfs/label "Residual Neural Network",
   :rdfs/subClassOf :aio/DNN})

(def Resizing_Layer
  {:db/ident :aio/Resizing_Layer,
   :obo/IAO_0000115
   "A preprocessing layer which resizes images. This layer resizes an image input to a target height and width. The input should be a 4D (batched) or 3D (unbatched) tensor in \"channels_last\" format. Input pixel values can be of any range (e.g. [0., 1.) or [0, 255]) and of interger or floating point dtype. By default, the layer will output floats. This layer can be called on tf.RaggedTensor batches of input images of distinct sizes, and will resize the outputs to dense tensors of uniform size.",
   :rdf/type :owl/Class,
   :rdfs/label "Resizing Layer",
   :rdfs/subClassOf :aio/Image_Preprocessing_Layer})

(def Restricted_Boltzmann_Machine
  {:db/ident :aio/Restricted_Boltzmann_Machine,
   :obo/IAO_0000115
   "A restricted Boltzmann machine (RBM) is a generative stochastic artificial neural network that can learn a probability distribution over its set of inputs.",
   :oboInOwl/hasExactSynonym "RBM",
   :rdf/type :owl/Class,
   :rdfs/comment "Backfed Input, Probabilistic Hidden",
   :rdfs/label "Restricted Boltzmann Machine",
   :rdfs/subClassOf :aio/BM})

(def Ridge_Regression
  {:db/ident :aio/Ridge_Regression,
   :obo/IAO_0000115
   "A method of estimating the coefficients of multiple-regression models in scenarios where the independent variables are highly correlated.[1] It has been used in many fields including econometrics, chemistry, and engineering.",
   :rdf/type :owl/Class,
   :rdfs/label "Ridge Regression",
   :rdfs/subClassOf :aio/Regression_Analysis})

(def SCN
  {:db/ident :aio/SCN,
   :rdf/type :owl/Class})

(def SeLu_Function
  {:db/ident :aio/SeLu_Function,
   :obo/IAO_0000115
   "The SELU activation function multiplies scale (> 1) with the output of the ELU function to ensure a slope larger than one for positive inputs.",
   :oboInOwl/hasExactSynonym #{"Scaled Exponential Linear Unit" "SELU"},
   :rdf/type :owl/Class,
   :rdfs/label "SELU Function",
   :rdfs/subClassOf :aio/Function})

(def Selection_And_Sampling_Bias
  {:db/ident :aio/Selection_And_Sampling_Bias,
   :obo/IAO_0000115
   "Bias introduced by the selection of individuals, groups, or data for analysis in such a way that proper randomization is not achieved, thereby failing to ensure that the sample obtained is representative of the population intended to be analyzed.",
   :oboInOwl/hasExactSynonym #{"Sampling Bias" "Selection Effect"
                               "Selection Bias"},
   :rdf/type :owl/Class,
   :rdfs/label "Selection And Sampling Bias",
   :rdfs/subClassOf :aio/Computational_Bias})

(def Selective_Adherence_Bias
  {:db/ident :aio/Selective_Adherence_Bias,
   :obo/IAO_0000115
   "Decision-makers’ inclination to selectively adopt algorithmic advice when it matches their pre-existing beliefs and stereotypes.",
   :rdf/type :owl/Class,
   :rdfs/label "Selective Adherence Bias",
   :rdfs/subClassOf :aio/Individual_Bias})

(def Self-supervised_Learning
  {:db/ident :aio/Self-supervised_Learning,
   :obo/IAO_0000115
   "Regarded as an intermediate form between supervised and unsupervised learning.",
   :rdf/type :owl/Class,
   :rdfs/label "Self-supervised Learning",
   :rdfs/subClassOf :aio/Machine_Learning})

(def SeparableConvolution1D_Layer
  {:db/ident :aio/SeparableConvolution1D_Layer,
   :obo/IAO_0000115
   "Depthwise separable 1D convolution. This layer performs a depthwise convolution that acts separately on channels, followed by a pointwise convolution that mixes channels. If use_bias is True and a bias initializer is provided, it adds a bias vector to the output. It then optionally applies an activation function to produce the final output.a",
   :oboInOwl/hasExactSynonym "SeparableConv1D Layer",
   :rdf/type :owl/Class,
   :rdfs/label "SeparableConvolution1D Layer",
   :rdfs/subClassOf :aio/Convolutional_Layer})

(def SeparableConvolution2D_Layer
  {:db/ident :aio/SeparableConvolution2D_Layer,
   :obo/IAO_0000115
   "Depthwise separable 2D convolution. Separable convolutions consist of first performing a depthwise spatial convolution (which acts on each input channel separately) followed by a pointwise convolution which mixes the resulting output channels. The depth_multiplier argument controls how many output channels are generated per input channel in the depthwise step. Intuitively, separable convolutions can be understood as a way to factorize a convolution kernel into two smaller kernels, or as an extreme version of an Inception block.",
   :oboInOwl/hasExactSynonym "SeparableConv2D Layer",
   :rdf/type :owl/Class,
   :rdfs/label "SeparableConvolution2D Layer",
   :rdfs/subClassOf :aio/Convolutional_Layer})

(def Sigmoid_Function
  {:db/ident :aio/Sigmoid_Function,
   :obo/IAO_0000115
   "Applies the sigmoid activation function sigmoid(x) = 1 / (1 + exp(-x)). For small values (<-5), sigmoid returns a value close to zero, and for large values (>5) the result of the function gets close to 1. Sigmoid is equivalent to a 2-element Softmax, where the second element is assumed to be zero. The sigmoid function always returns a value between 0 and 1.",
   :rdf/type :owl/Class,
   :rdfs/label "Sigmoid Function",
   :rdfs/subClassOf :aio/Function})

(def SimpleRNNCell_Layer
  {:db/ident :aio/SimpleRNNCell_Layer,
   :obo/IAO_0000115
   "Cell class for SimpleRNN. This class processes one step within the whole time sequence input, whereas tf.keras.layer.SimpleRNN processes the whole sequence.",
   :rdf/type :owl/Class,
   :rdfs/label "SimpleRNNCell Layer",
   :rdfs/subClassOf :aio/Layer})

(def SimpleRNN_Layer
  {:db/ident :aio/SimpleRNN_Layer,
   :obo/IAO_0000115
   "Fully-connected RNN where the output is to be fed back to input.",
   :rdf/type :owl/Class,
   :rdfs/label "SimpleRNN Layer",
   :rdfs/subClassOf :aio/Recurrent_Layer})

(def Simpon's_Paradox_Bias
  {:db/ident :aio/Simpon's_Paradox_Bias,
   :obo/IAO_0000115
   "A statistical phenomenon where the marginal association between two categorical variables is qualitatively different from the partial association between the same two variables after controlling for one or more other variables. For example, the statistical association or correlation that has been detected between two variables for an entire population disappears or reverses when the population is divided into subgroups.",
   :oboInOwl/hasExactSynonym "Simpson's Paradox",
   :rdf/type :owl/Class,
   :rdfs/label "Simpon's Paradox Bias",
   :rdfs/subClassOf :aio/Selection_And_Sampling_Bias})

(def Societal_Bias
  {:db/ident :aio/Societal_Bias,
   :obo/IAO_0000115
   "Can be positive or negative, and take a number of different forms, but is typically characterized as being for or against groups or individuals based on social identities, demographic factors, or immutable physical characteristics. Societal or social biases are often stereotypes. Common examples of societal or social biases are based on concepts like race, ethnicity, gender, sexual orientation, socioeconomic status, education, and more. Societal bias is often recognized and discussed in the context of NLP (Natural Language Processing) models.",
   :oboInOwl/hasExactSynonym "Social Bias",
   :rdf/type :owl/Class,
   :rdfs/label "Societal Bias",
   :rdfs/subClassOf :aio/Bias})

(def Softmax_Function
  {:db/ident :aio/Softmax_Function,
   :obo/IAO_0000115
   "The elements of the output vector are in range (0, 1) and sum to 1. Each vector is handled independently. The axis argument sets which axis of the input the function is applied along. Softmax is often used as the activation for the last layer of a classification network because the result could be interpreted as a probability distribution. The softmax of each vector x is computed as exp(x) / tf.reduce_sum(exp(x)). The input values in are the log-odds of the resulting probability.",
   :rdf/type :owl/Class,
   :rdfs/label "Softmax Function",
   :rdfs/subClassOf :aio/Function})

(def Softmax_Layer
  {:db/ident        :aio/Softmax_Layer,
   :obo/IAO_0000115 "Softmax activation function.",
   :rdf/type        :owl/Class,
   :rdfs/label      "Softmax Layer",
   :rdfs/subClassOf :aio/Activation_Layer})

(def Softplus_Function
  {:db/ident        :aio/Softplus_Function,
   :obo/IAO_0000115 "softplus(x) = log(exp(x) + 1)",
   :rdf/type        :owl/Class,
   :rdfs/label      "Softplus Function",
   :rdfs/subClassOf :aio/Function})

(def Softsign_Function
  {:db/ident        :aio/Softsign_Function,
   :obo/IAO_0000115 "softsign(x) = x / (abs(x) + 1)",
   :rdf/type        :owl/Class,
   :rdfs/label      "Softsign Function",
   :rdfs/subClassOf :aio/Function})

(def Sparse_AE
  {:db/ident :aio/Sparse_AE,
   :obo/IAO_0000115
   "Sparse autoencoders may include more (rather than fewer) hidden units than inputs, but only a small number of the hidden units are allowed to be active at the same time (thus, sparse). This constraint forces the model to respond to the unique statistical features of the training data. (https://en.wikipedia.org/wiki/Autoencoder)",
   :oboInOwl/hasExactSynonym "SAE",
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Hidden, Matched Output-Input",
   :rdfs/label "Sparse AE",
   :rdfs/subClassOf :aio/AE})

(def Sparse_Learning
  {:db/ident :aio/Sparse_Learning,
   :obo/IAO_0000115
   "Methods which aim to find sparse representations of the input data in the form of a linear combination of basic elements as well as those basic elements themselves.",
   :oboInOwl/hasExactSynonym #{"Sparse dictionary Learning" "Sparse coding"},
   :rdf/type :owl/Class,
   :rdfs/label "Sparse Learning",
   :rdfs/subClassOf :aio/Representation_Learning})

(def SpatialDropout1D_Layer
  {:db/ident :aio/SpatialDropout1D_Layer,
   :obo/IAO_0000115
   "Spatial 1D version of Dropout. This version performs the same function as Dropout, however, it drops entire 1D feature maps instead of individual elements. If adjacent frames within feature maps are strongly correlated (as is normally the case in early convolution layers) then regular dropout will not regularize the activations and will otherwise just result in an effective Learning rate decrease. In this case, SpatialDropout1D will help promote independence between feature maps and should be used instead.",
   :rdf/type :owl/Class,
   :rdfs/label "SpatialDropout1D Layer",
   :rdfs/subClassOf :aio/Regularization_Layer})

(def SpatialDropout2D_Layer
  {:db/ident :aio/SpatialDropout2D_Layer,
   :obo/IAO_0000115
   "Spatial 2D version of Dropout. This version performs the same function as Dropout, however, it drops entire 2D feature maps instead of individual elements. If adjacent pixels within feature maps are strongly correlated (as is normally the case in early convolution layers) then regular dropout will not regularize the activations and will otherwise just result in an effective Learning rate decrease. In this case, SpatialDropout2D will help promote independence between feature maps and should be used instead.a",
   :rdf/type :owl/Class,
   :rdfs/label "SpatialDropout2D Layer",
   :rdfs/subClassOf :aio/Regularization_Layer})

(def SpatialDropout3D_Layer
  {:db/ident :aio/SpatialDropout3D_Layer,
   :obo/IAO_0000115
   "Spatial 3D version of Dropout. This version performs the same function as Dropout, however, it drops entire 3D feature maps instead of individual elements. If adjacent voxels within feature maps are strongly correlated (as is normally the case in early convolution layers) then regular dropout will not regularize the activations and will otherwise just result in an effective Learning rate decrease. In this case, SpatialDropout3D will help promote independence between feature maps and should be used instead.",
   :rdf/type :owl/Class,
   :rdfs/label "SpatialDropout3D Layer",
   :rdfs/subClassOf :aio/Regularization_Layer})

(def Spatial_Regression
  {:db/ident        :aio/Spatial_Regression,
   :obo/IAO_0000115 "Regression method used to model spatial relationships.",
   :rdf/type        :owl/Class,
   :rdfs/label      "Spatial Regression",
   :rdfs/subClassOf :aio/Regression_Analysis})

(def StackedRNNCells_Layer
  {:db/ident :aio/StackedRNNCells_Layer,
   :obo/IAO_0000115
   "Wrapper allowing a stack of RNN cells to behave as a single cell. Used to implement efficient stacked RNNs.",
   :rdf/type :owl/Class,
   :rdfs/label "StackedRNNCells Layer",
   :rdfs/subClassOf :aio/Layer})

(def Streetlight_Effect_Bias
  {:db/ident :aio/Streetlight_Effect_Bias,
   :obo/IAO_0000115
   "A bias whereby people tend to search only where it is easiest to look.",
   :oboInOwl/hasExactSynonym "Streetlight Effect",
   :rdf/type :owl/Class,
   :rdfs/label "Streetlight Effect Bias",
   :rdfs/subClassOf :aio/Individual_Bias})

(def StringLookup_Layer
  {:db/ident :aio/StringLookup_Layer,
   :obo/IAO_0000115
   "A preprocessing layer which maps string features to integer indices.",
   :rdf/type :owl/Class,
   :rdfs/label "StringLookup Layer",
   :rdfs/subClassOf :aio/Categorical_Features_Preprocessing_Layer})

(def Subtract_Layer
  {:db/ident :aio/Subtract_Layer,
   :obo/IAO_0000115
   "Layer that subtracts two inputs. It takes as input a list of tensors of size 2, both of the same shape, and returns a single tensor, (inputs[0] - inputs[1]), also of the same shape.",
   :rdf/type :owl/Class,
   :rdfs/label "Subtract Layer",
   :rdfs/subClassOf :aio/Merging_Layer})

(def Sunk_Cost_Fallacy_Bias
  {:db/ident :aio/Sunk_Cost_Fallacy_Bias,
   :obo/IAO_0000115
   "A human tendency where people opt to continue with an endeavor or behavior due to previously spent or invested resources, such as money, time, and effort, regardless of whether costs outweigh benefits. For example, in AI, the sunk cost fallacy could lead development teams and organizations to feel that because they have already invested so much time and money into a particular AI application, they must pursue it to market rather than deciding to end the effort, even in the face of significant technical debt and/or ethical debt.",
   :oboInOwl/hasExactSynonym "Sunk Cost Fallacy",
   :rdf/type :owl/Class,
   :rdfs/label "Sunk Cost Fallacy Bias",
   :rdfs/subClassOf :aio/Group_Bias})

(def Supervised_Biclustering
  {:db/ident :aio/Supervised_Biclustering,
   :obo/IAO_0000115
   "Methods that simultaneously cluster the rows and columns of a labeled matrix, also taking into account the data label contributions to cluster coherence.",
   :oboInOwl/hasExactSynonym
   #{"Supervised Two-way Clustering" "Supervised Joint Clustering"
     "Supervised Two-mode Clustering" "Supervised Co-clustering"
     "Supervised Block Clustering"},
   :rdf/type :owl/Class,
   :rdfs/label "Supervised Biclustering",
   :rdfs/subClassOf :aio/Biclustering})

(def Supervised_Clustering
  {:db/ident :aio/Supervised_Clustering,
   :obo/IAO_0000115
   "Methods that group a set of labeled objects in such a way that objects in the same group (called a cluster) are more similarly labeled (in some sense) relative to those in other groups (clusters).",
   :oboInOwl/hasExactSynonym "Cluster analysis",
   :rdf/type :owl/Class,
   :rdfs/label "Supervised Clustering",
   :rdfs/subClassOf :aio/Clustering})

(def Supervised_Learning
  {:db/ident :aio/Supervised_Learning,
   :obo/IAO_0000115
   "Methods that can learn a function that maps an input to an output based on example input-output pairs.",
   :rdf/type :owl/Class,
   :rdfs/label "Supervised Learning",
   :rdfs/subClassOf :aio/Machine_Learning})

(def Support_Vector_Machine
  {:db/ident :aio/Support_Vector_Machine,
   :obo/IAO_0000115
   "In machine Learning, support-vector machines (SVMs, also support-vector networks) are supervised Learning models with associated Learning algorithms that analyze data for classification and regression analysis. Developed at AT&T Bell Laboratories by Vladimir Vapnik with colleagues (Boser et al., 1992, Guyon et al., 1993, Vapnik et al., 1997) SVMs are one of the most robust prediction methods, being based on statistical Learning frameworks or VC theory proposed by Vapnik (1982, 1995) and Chervonenkis (1974). Given a set of training examples, each marked as belonging to one of two categories, an SVM training algorithm builds a model that assigns new examples to one category or the other, making it a non-probabilistic binary linear classifier (although methods such as Platt scaling exist to use SVM in a probabilistic classification setting). SVM maps training examples to points in space so as to maximise the width of the gap between the two categories. New examples are then mapped into that same space and predicted to belong to a category based on which side of the gap they fall.",
   :oboInOwl/hasExactSynonym #{"SVN" "Supper Vector Network" "SVM"},
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Hidden, Output",
   :rdfs/label "Support Vector Machine",
   :rdfs/subClassOf :aio/Network})

(def Survival_Analysis
  {:db/ident :aio/Survival_Analysis,
   :obo/IAO_0000115
   "Methods for nalyzing the expected duration of time until one event occurs, such as death in biological organisms and failure in mechanical systems.",
   :rdf/type :owl/Class,
   :rdfs/label "Survival Analysis",
   :rdfs/subClassOf :aio/Machine_Learning})

(def Survivorship_Bias
  {:db/ident :aio/Survivorship_Bias,
   :obo/IAO_0000115
   "Tendency for people to focus on the items, observations, or people that “survive” or make it past a selection process, while overlooking those that did not.",
   :rdf/type :owl/Class,
   :rdfs/label "Survivorship Bias",
   :rdfs/subClassOf :aio/Processing_Bias})

(def Swish_Function
  {:db/ident :aio/Swish_Function,
   :obo/IAO_0000115
   "x*sigmoid(x). It is a smooth, non-monotonic function that consistently matches or outperforms ReLU on deep networks, it is unbounded above and bounded below.",
   :rdf/type :owl/Class,
   :rdfs/label "Swish Function",
   :rdfs/subClassOf :aio/Function})

(def Symmetrically_Connected_Network
  {:db/ident :aio/Symmetrically_Connected_Network,
   :obo/IAO_0000115
   "Like recurrent networks, but the connections between units are symmetrical (they have the same weight in both directions).",
   :oboInOwl/hasExactSynonym "SCN",
   :rdf/type :owl/Class,
   :rdfs/label "Symmetrically Connected Network",
   :rdfs/subClassOf :aio/Network})

(def SyncBatchNorm_Layer
  {:db/ident :aio/SyncBatchNorm_Layer,
   :obo/IAO_0000115
   "Applies Batch Normalization over a N-Dimensional input (a mini-batch of [N-2]D inputs with additional channel dimension) as described in the paper Batch Normalization: Accelerating Deep Network Training by Reducing Internal Covariate Shift .",
   :oboInOwl/hasExactSynonym #{"SyncBatchNorm" "nn.SyncBatchNorm"},
   :rdf/type :owl/Class,
   :rdfs/label "SyncBatchNorm Layer",
   :rdfs/subClassOf :aio/BatchNormalization_Layer})

(def Systemic_Bias
  {:db/ident :aio/Systemic_Bias,
   :obo/IAO_0000115
   "Biases that result from procedures and practices of particular institutions that operate in ways which result in certain social groups being advantaged or favored and others being disadvantaged or devalued.",
   :oboInOwl/hasExactSynonym #{"Institutional Bias" "Societal Bias"},
   :rdf/type :owl/Class,
   :rdfs/label "Systemic Bias",
   :rdfs/subClassOf :aio/Bias})

(def Tanh_Function
  {:db/ident        :aio/Tanh_Function,
   :obo/IAO_0000115 "Hyperbolic tangent activation function.",
   :oboInOwl/hasExactSynonym "hyperbolic tangent",
   :rdf/type        :owl/Class,
   :rdfs/label      "Tanh Function",
   :rdfs/subClassOf :aio/Function})

(def Temporal_Bias
  {:db/ident :aio/Temporal_Bias,
   :obo/IAO_0000115
   "Bias that arises from differences in populations and behaviors over time.",
   :rdf/type :owl/Class,
   :rdfs/label "Temporal Bias",
   :rdfs/subClassOf :aio/Selection_And_Sampling_Bias})

(def TextVectorization_Layer
  {:db/ident :aio/TextVectorization_Layer,
   :obo/IAO_0000115
   "A preprocessing layer which maps text features to integer sequences.",
   :rdf/type :owl/Class,
   :rdfs/label "TextVectorization Layer",
   :rdfs/subClassOf :aio/Text_Preprocessing_Layer})

(def Text_Preprocessing_Layer
  {:db/ident        :aio/Text_Preprocessing_Layer,
   :obo/IAO_0000115 "A layer that performs text data preprocessing operations.",
   :rdf/type        :owl/Class,
   :rdfs/label      "Text Preprocessing Layer",
   :rdfs/subClassOf :aio/Layer})

(def ThresholdedReLU_Layer
  {:db/ident        :aio/ThresholdedReLU_Layer,
   :obo/IAO_0000115 "Thresholded Rectified Linear Unit.",
   :rdf/type        :owl/Class,
   :rdfs/label      "ThresholdedReLU Layer",
   :rdfs/subClassOf :aio/Activation_Layer})

(def TimeDistributed_Layer
  {:db/ident :aio/TimeDistributed_Layer,
   :obo/IAO_0000115
   "This wrapper allows to apply a layer to every temporal slice of an input. Every input should be at least 3D, and the dimension of index one of the first input will be considered to be the temporal dimension. Consider a batch of 32 video samples, where each sample is a 128x128 RGB image with channels_last data format, across 10 timesteps. The batch input shape is (32, 10, 128, 128, 3). You can then use TimeDistributed to apply the same Conv2D layer to each of the 10 timesteps, independently:",
   :rdf/type :owl/Class,
   :rdfs/label "TimeDistributed Layer",
   :rdfs/subClassOf :aio/Recurrent_Layer})

(def Time_Series_Analysis
  {:db/ident :aio/Time_Series_Analysis,
   :obo/IAO_0000115
   "Methods for analyzing time series data in order to extract meaningful statistics and other characteristics of the data.",
   :rdf/type :owl/Class,
   :rdfs/label "Time Series Analysis",
   :rdfs/subClassOf :aio/Machine_Learning})

(def Time_Series_Forecasting
  {:db/ident :aio/Time_Series_Forecasting,
   :obo/IAO_0000115
   "Methods that predict future values based on previously observed values.",
   :rdf/type :owl/Class,
   :rdfs/label "Time Series Forecasting",
   :rdfs/subClassOf :aio/Machine_Learning})

(def Transfer_Learning
  {:db/ident :aio/Transfer_Learning,
   :obo/IAO_0000115
   "Methods which can reuse or transfer information from previously learned tasks for the Learning of new tasks.",
   :rdf/type :owl/Class,
   :rdfs/label "Transfer Learning",
   :rdfs/subClassOf :aio/Machine_Learning})

(def Transformer_Network
  {:db/ident :aio/Transformer_Network,
   :obo/IAO_0000115
   "A transformer is a deep Learning model that adopts the mechanism of attention, differentially weighing the significance of each part of the input data. It is used primarily in the field of natural language processing (NLP) and in computer vision (CV). (https://en.wikipedia.org/wiki/Transformer_(machine_Learning_model))",
   :rdf/type :owl/Class,
   :rdfs/label "Transformer Network",
   :rdfs/subClassOf :aio/DNN})

(def UPN
  {:db/ident :aio/UPN,
   :rdf/type :owl/Class})

(def Uncertainty_Bias
  {:db/ident :aio/Uncertainty_Bias,
   :obo/IAO_0000115
   "Arises when predictive algorithms favor groups that are better represented in the training data, since there will be less uncertainty associated with those predictions.",
   :rdf/type :owl/Class,
   :rdfs/label "Uncertainty Bias",
   :rdfs/subClassOf :aio/Selection_And_Sampling_Bias})

(def UnitNormalization_Layer
  {:db/ident :aio/UnitNormalization_Layer,
   :obo/IAO_0000115
   "Unit normalization layer. Normalize a batch of inputs so that each input in the batch has a L2 norm equal to 1 (across the axes specified in axis).",
   :rdf/type :owl/Class,
   :rdfs/label "UnitNormalization Layer",
   :rdfs/subClassOf :aio/Recurrent_Layer})

(def Unsupervised_Biclustering
  {:db/ident :aio/Unsupervised_Biclustering,
   :obo/IAO_0000115
   "Methods that simultaneously cluster the rows and columns of an unlabeled input matrix.",
   :oboInOwl/hasExactSynonym #{"Two-way Clustering" "Block Clustering"
                               "Co-clustering" "Two-mode Clustering"
                               "Joint Clustering"},
   :rdf/type :owl/Class,
   :rdfs/label "Unsupervised Biclustering",
   :rdfs/subClassOf :aio/Biclustering})

(def Unsupervised_Clustering
  {:db/ident :aio/Unsupervised_Clustering,
   :obo/IAO_0000115
   "Methods that group a set of objects in such a way that objects without labels in the same group (called a cluster) are more similar (in some sense) to each other than to those in other groups (clusters).",
   :oboInOwl/hasExactSynonym "Cluster analysis",
   :rdf/type :owl/Class,
   :rdfs/label "Unsupervised Clustering",
   :rdfs/subClassOf :aio/Clustering})

(def Unsupervised_Learning
  {:db/ident        :aio/Unsupervised_Learning,
   :obo/IAO_0000115 "Algorithms that learns patterns from unlabeled data.",
   :rdf/type        :owl/Class,
   :rdfs/label      "Unsupervised Learning",
   :rdfs/subClassOf :aio/Machine_Learning})

(def Unsupervised_Pretrained_Network
  {:db/ident :aio/Unsupervised_Pretrained_Network,
   :obo/IAO_0000115
   "Unsupervised pre-training initializes a discriminative neural net from one which was trained using an unsupervised criterion, such as a deep belief network or a deep autoencoder. This method can sometimes help with both the optimization and the overfitting issues.",
   :oboInOwl/hasExactSynonym "UPN",
   :rdf/type :owl/Class,
   :rdfs/label "Unsupervised Pretrained Network",
   :rdfs/subClassOf :aio/Network})

(def UpSampling1D_Layer
  {:db/ident :aio/UpSampling1D_Layer,
   :obo/IAO_0000115
   "Upsampling layer for 1D inputs. Repeats each temporal step size times along the time axis.",
   :rdf/type :owl/Class,
   :rdfs/label "UpSampling1D Layer",
   :rdfs/subClassOf :aio/Reshaping_Layer})

(def UpSampling2D_Layer
  {:db/ident :aio/UpSampling2D_Layer,
   :obo/IAO_0000115
   "Upsampling layer for 2D inputs. Repeats the rows and columns of the data by size[0] and size[1] respectively.",
   :rdf/type :owl/Class,
   :rdfs/label "UpSampling2D Layer",
   :rdfs/subClassOf :aio/Layer})

(def UpSampling3D_Layer
  {:db/ident        :aio/UpSampling3D_Layer,
   :obo/IAO_0000115 "Upsampling layer for 3D inputs.",
   :rdf/type        :owl/Class,
   :rdfs/label      "UpSampling3D Layer",
   :rdfs/subClassOf :aio/Layer})

(def Use_And_Interpretation_Bias
  {:db/ident :aio/Use_And_Interpretation_Bias,
   :obo/IAO_0000115
   "An information-processing bias, the tendency to inappropriately analyze ambiguous stimuli, scenarios and events.",
   :oboInOwl/hasExactSynonym "Interpretive Bias",
   :rdf/type :owl/Class,
   :rdfs/label "Use And Interpretation Bias",
   :rdfs/subClassOf :aio/Computational_Bias})

(def User_Interaction_Bias
  {:db/ident :aio/User_Interaction_Bias,
   :obo/IAO_0000115
   "Arises when a user imposes their own self-selected biases and behavior during interaction with data, output, results, etc.",
   :rdf/type :owl/Class,
   :rdfs/label "User Interaction Bias",
   :rdfs/subClassOf :aio/Individual_Bias})

(def Variational_Auto_Encoder
  {:db/ident :aio/Variational_Auto_Encoder,
   :obo/IAO_0000115
   "Variational autoencoders are meant to compress the input information into a constrained multivariate latent distribution (encoding) to reconstruct it as accurately as possible (decoding). (https://en.wikipedia.org/wiki/Variational_autoencoder)",
   :oboInOwl/hasExactSynonym "VAE",
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Probabilistic Hidden, Matched Output-Input",
   :rdfs/label "Variational Auto Encoder",
   :rdfs/subClassOf :aio/AE})

(def W2V_CBOW
  {:db/ident :aio/W2V_CBOW,
   :rdf/type :owl/Class})

(def W2V_SkipGram
  {:db/ident :aio/W2V_SkipGram,
   :rdf/type :owl/Class})

(def Wrapper_Layer
  {:db/ident :aio/Wrapper_Layer,
   :obo/IAO_0000115
   "Abstract wrapper base class. Wrappers take another layer and augment it in various ways. Do not use this class as a layer, it is only an abstract base class. Two usable wrappers are the TimeDistributed and Bidirectional wrappers.",
   :rdf/type :owl/Class,
   :rdfs/label "Wrapper Layer",
   :rdfs/subClassOf :aio/Layer})

(def Zero-shot_Learning
  {:db/ident :aio/Zero-shot_Learning,
   :obo/IAO_0000115
   "Methods where at test time, a learner observes samples from classes, which were not observed during training, and needs to predict the class that they belong to.",
   :oboInOwl/hasExactSynonym "ZSL",
   :rdf/type :owl/Class,
   :rdfs/label "Zero-shot Learning",
   :rdfs/subClassOf :aio/DNN})

(def ZeroPadding1D_Layer
  {:db/ident        :aio/ZeroPadding1D_Layer,
   :obo/IAO_0000115 "Zero-padding layer for 1D input (e.g. temporal sequence).",
   :rdf/type        :owl/Class,
   :rdfs/label      "ZeroPadding1D Layer",
   :rdfs/subClassOf :aio/Reshaping_Layer})

(def ZeroPadding2D_Layer
  {:db/ident :aio/ZeroPadding2D_Layer,
   :obo/IAO_0000115
   "Zero-padding layer for 2D input (e.g. picture). This layer can add rows and columns of zeros at the top, bottom, left and right side of an image tensor.",
   :rdf/type :owl/Class,
   :rdfs/label "ZeroPadding2D Layer",
   :rdfs/subClassOf :aio/Reshaping_Layer})

(def ZeroPadding3D_Layer
  {:db/ident :aio/ZeroPadding3D_Layer,
   :obo/IAO_0000115
   "Zero-padding layer for 3D data (spatial or spatio-temporal).",
   :rdf/type :owl/Class,
   :rdfs/label "ZeroPadding3D Layer",
   :rdfs/subClassOf :aio/Reshaping_Layer})

(def eLu_Function
  {:db/ident :aio/eLu_Function,
   :obo/IAO_0000115
   "The exponential linear unit (ELU) with alpha > 0 is: x if x > 0 and alpha * (exp(x) - 1) if x < 0 The ELU hyperparameter alpha controls the value to which an ELU saturates for negative net inputs. ELUs diminish the vanishing gradient effect. ELUs have negative values which pushes the mean of the activations closer to zero. Mean activations that are closer to zero enable faster Learning as they bring the gradient closer to the natural gradient. ELUs saturate to a negative value when the argument gets smaller. Saturation means a small derivative which decreases the variation and the information that is propagated to the next layer.",
   :oboInOwl/hasExactSynonym #{"Exponential Linear Unit" "ELU"},
   :rdf/type :owl/Class,
   :rdfs/label "ELU Function",
   :rdfs/subClassOf :aio/Function})

(def node2vec-CBOW
  {:db/ident :aio/node2vec-CBOW,
   :obo/IAO_0000115
   "In the continuous bag-of-words architecture, the model predicts the current node from a window of surrounding context nodes. The order of context nodes does not influence prediction (bag-of-words assumption).",
   :oboInOwl/hasExactSynonym "N2V-CBOW",
   :oboInOwl/hasRelatedSynonym "CBOW",
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Hidden, Output",
   :rdfs/label "node2vec-CBOW",
   :rdfs/subClassOf :aio/W2V_CBOW})

(def node2vec-SkipGram
  {:db/ident :aio/node2vec-SkipGram,
   :obo/IAO_0000115
   "In the continuous skip-gram architecture, the model uses the current node to predict the surrounding window of context nodes. The skip-gram architecture weighs nearby context nodes more heavily than more distant context nodes. (https://en.wikipedia.org/wiki/Word2vec)",
   :oboInOwl/hasExactSynonym "N2V-SkipGram",
   :oboInOwl/hasRelatedSynonym "SkipGram",
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Hidden, Output",
   :rdfs/label "node2vec-SkipGram",
   :rdfs/subClassOf :aio/W2V_SkipGram})

(def t-Distributed_Stochastic_Neighbor_embedding
  {:db/ident :aio/t-Distributed_Stochastic_Neighbor_embedding,
   :obo/IAO_0000115
   "A statistical method for visualizing high-dimensional data by giving each datapoint a location in a two or three-dimensional map.",
   :oboInOwl/hasExactSynonym #{"tSNE" "t-SNE"},
   :rdf/type :owl/Class,
   :rdfs/label "t-Distributed Stochastic Neighbor embedding",
   :rdfs/subClassOf :aio/Dimensionality_Reduction})

(def word2vec-CBOW
  {:db/ident :aio/word2vec-CBOW,
   :obo/IAO_0000115
   "In the continuous bag-of-words architecture, the model predicts the current word from a window of surrounding context words. The order of context words does not influence prediction (bag-of-words assumption). (https://en.wikipedia.org/wiki/Word2vec)",
   :oboInOwl/hasExactSynonym "W2V-CBOW",
   :oboInOwl/hasRelatedSynonym "CBOW",
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Hidden, Output",
   :rdfs/label "word2vec-CBOW",
   :rdfs/subClassOf :aio/ANN})

(def word2vec-SkipGram
  {:db/ident :aio/word2vec-SkipGram,
   :obo/IAO_0000115
   "In the continuous skip-gram architecture, the model uses the current word to predict the surrounding window of context words. The skip-gram architecture weighs nearby context words more heavily than more distant context words.",
   :oboInOwl/hasExactSynonym "W2V-SkipGram",
   :oboInOwl/hasRelatedSynonym "SkipGram",
   :rdf/type :owl/Class,
   :rdfs/comment "Input, Hidden, Output",
   :rdfs/label "word2vec-SkipGram",
   :rdfs/subClassOf :aio/ANN})

(def ^{:private true} IAO_0000115
  {:db/ident :obo/IAO_0000115,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} hasDbXref
  {:db/ident :oboInOwl/hasDbXref,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} hasExactSynonym
  {:db/ident :oboInOwl/hasExactSynonym,
   :rdf/type :owl/AnnotationProperty})

(def ^{:private true} hasRelatedSynonym
  {:db/ident :oboInOwl/hasRelatedSynonym,
   :rdf/type :owl/AnnotationProperty})

(def urn:uuid:69cc28b2-e420-5288-844d-efcdab55293a
  {:dc11/description
   "This ontology models classes and relationships describing deep learning networks, their component layers and activation functions, as well as potential biases.",
   :dc11/title "Artificial Intelligence Ontology",
   :dcterms/license {:xsd/anyURI "http://creativecommons.org/licenses/by/4.0/"},
   :owl/versionIRI
   {:xsd/anyURI
    "http://purl.obolibrary.org/obo/aio/releases/2023-09-08/aio.owl"},
   :owl/versionInfo "2023-09-08",
   :rdf/type :owl/Ontology,
   :xsd/anyURI "http://purl.obolibrary.org/obo/aio.owl"})